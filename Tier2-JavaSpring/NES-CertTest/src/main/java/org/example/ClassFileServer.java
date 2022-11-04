package org.example;

import java.io.*;
import java.net.*;
import java.security.KeyStore;
import javax.net.*;
import javax.net.ssl.*;
import java.security.cert.X509Certificate;

/* ClassFileServer.java -- a simple file server that can server
 * Http get request in both clear and secure channel
 *
 * The ClassFileServer implements a ClassServer that
 * reads files from the file system.
 */

public class ClassFileServer extends ClassServer {

    private String docroot;

    private static int DefaultServerPort = 2001;

    /**
     * Constructs a ClassFileServer.
     *
     * x@param path the path where the server locates files
     */
    public ClassFileServer(ServerSocket ss, String docroot) throws IOException
    {
        super(ss);
        this.docroot = docroot;
    }

    /**
     * Returns an array of bytes containing the bytes for
     * the file represented by the argument <b>path</b>.
     *
     * @return the bytes for the file
     */
    public byte[] getBytes(String path)
            throws IOException
    {
        System.out.println("Reading: " + path);
        File f = new File(docroot + File.separator + path);
        int length = (int)(f.length());
        if (length == 0) {
            throw new IOException("File length is zero: " + path);
        } else {
            FileInputStream fin = new FileInputStream(f);
            DataInputStream in = new DataInputStream(fin);

            byte[] bytecodes = new byte[length];
            in.readFully(bytecodes);
            return bytecodes;
        }
    }

    /**
     * Main method to create the class server that reads
     * files.
     */
    public static void main(String args[])
    {
        System.out.println("Starting");
        int port = DefaultServerPort;
        String docroot = "";

        // If type = "TLS" using https/TLS
        // If type anything else using http only
        String type = "TLS";

        try {
            ServerSocketFactory ssf =
                    ClassFileServer.getServerSocketFactory(type);
            ServerSocket ss = ssf.createServerSocket(port);
            if (type.equals("TLS clint")){
                ((SSLServerSocket)ss).setNeedClientAuth(true);
            }
            new ClassFileServer(ss, docroot);
        } catch (IOException e) {
            System.out.println("Unable to start ClassServer: " +
                    e.getMessage());
            e.printStackTrace();
        }
    }

    private static ServerSocketFactory getServerSocketFactory(String type) {
        if (type.equals("TLS")||type.equals("TLS client")) {
            System.out.println("Running TLS");
            SSLServerSocketFactory ssf = null;
            try {
                // set up key manager to do server authentication
                SSLContext ctx;
                KeyManagerFactory kmf;
                KeyStore ks;
                char[] passphrase = "password".toCharArray();

                ctx = SSLContext.getInstance("TLS");
                kmf = KeyManagerFactory.getInstance("SunX509");
                ks = KeyStore.getInstance("JKS");

                // argument: path to keystore
                ks.load(new FileInputStream("C:\\Users\\Jakub Nowak\\Desktop\\Assignments_Excercises\\3sem\\nes\\MyKeyStore.jks"),passphrase);

                kmf.init(ks, passphrase);
                ctx.init(kmf.getKeyManagers(), null, null);

                ssf = ctx.getServerSocketFactory();
                return ssf;
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("NOT running TLS");
            return ServerSocketFactory.getDefault();
        }
        return null;
    }
}

