// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: definitions.proto

package via.generatedprotos;

public final class Definitions {
  private Definitions() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_ListUsers_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_ListUsers_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_WaterUsage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_WaterUsage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_ElectricityUsage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_ElectricityUsage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_WaterUsageAdvice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_WaterUsageAdvice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_ElectricityUsageAdvice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_ElectricityUsageAdvice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_ID_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_ID_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_Username_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_Username_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_Empty_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_Empty_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_ListWaterUsage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_ListWaterUsage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_ListElectricityUsage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_ListElectricityUsage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_ListWaterUsageAdvice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_ListWaterUsageAdvice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_ListElectricityUsageAdvice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_ListElectricityUsageAdvice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_generatedprotos_AdviceCreation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_generatedprotos_AdviceCreation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021definitions.proto\022\017generatedprotos\"R\n\004" +
      "User\022\n\n\002id\030\001 \001(\005\022\020\n\010username\030\002 \001(\t\022\020\n\010pa" +
      "ssword\030\003 \001(\t\022\014\n\004role\030\004 \001(\005\022\014\n\004area\030\005 \001(\005" +
      "\"1\n\tListUsers\022$\n\005users\030\001 \003(\0132\025.generated" +
      "protos.User\"U\n\nWaterUsage\022\n\n\002id\030\001 \001(\005\022\016\n" +
      "\006amount\030\002 \001(\001\022\r\n\005month\030\003 \001(\005\022\014\n\004year\030\004 \001" +
      "(\005\022\016\n\006userId\030\005 \001(\005\"[\n\020ElectricityUsage\022\n" +
      "\n\002id\030\001 \001(\005\022\016\n\006amount\030\002 \001(\001\022\r\n\005month\030\003 \001(" +
      "\005\022\014\n\004year\030\004 \001(\005\022\016\n\006userId\030\005 \001(\005\",\n\020Water" +
      "UsageAdvice\022\n\n\002id\030\001 \001(\005\022\014\n\004body\030\002 \001(\t\"2\n" +
      "\026ElectricityUsageAdvice\022\n\n\002id\030\001 \001(\005\022\014\n\004b" +
      "ody\030\002 \001(\t\"\020\n\002ID\022\n\n\002id\030\001 \001(\005\"\034\n\010Username\022" +
      "\020\n\010username\030\001 \001(\t\"\007\n\005Empty\"<\n\016ListWaterU" +
      "sage\022*\n\005water\030\001 \003(\0132\033.generatedprotos.Wa" +
      "terUsage\"N\n\024ListElectricityUsage\0226\n\013elec" +
      "tricity\030\001 \003(\0132!.generatedprotos.Electric" +
      "ityUsage\"H\n\024ListWaterUsageAdvice\0220\n\005wate" +
      "r\030\001 \003(\0132!.generatedprotos.WaterUsageAdvi" +
      "ce\"Z\n\032ListElectricityUsageAdvice\022<\n\013elec" +
      "tricity\030\001 \003(\0132\'.generatedprotos.Electric" +
      "ityUsageAdvice\"2\n\016AdviceCreation\022\016\n\006user" +
      "Id\030\001 \001(\005\022\020\n\010adviceId\030\002 \001(\0052\332\007\n\024Resources" +
      "Consumption\022[\n\023LogElectricityUsage\022!.gen" +
      "eratedprotos.ElectricityUsage\032!.generate" +
      "dprotos.ElectricityUsage\022I\n\rLogWaterUsag" +
      "e\022\033.generatedprotos.WaterUsage\032\033.generat" +
      "edprotos.WaterUsage\022I\n\016GetWaterUsages\022\026." +
      "generatedprotos.Empty\032\037.generatedprotos." +
      "ListWaterUsage\022U\n\024GetElectricityUsages\022\026" +
      ".generatedprotos.Empty\032%.generatedprotos" +
      ".ListElectricityUsage\022L\n\020UpdateWaterUsag" +
      "e\022\033.generatedprotos.WaterUsage\032\033.generat" +
      "edprotos.WaterUsage\022^\n\026UpdateElectricity" +
      "Usage\022!.generatedprotos.ElectricityUsage" +
      "\032!.generatedprotos.ElectricityUsage\022?\n\020D" +
      "eleteWaterUsage\022\023.generatedprotos.ID\032\026.g" +
      "eneratedprotos.Empty\022E\n\026DeleteElectricit" +
      "yUsage\022\023.generatedprotos.ID\032\026.generatedp" +
      "rotos.Empty\022E\n\021GetWaterUsageById\022\023.gener" +
      "atedprotos.ID\032\033.generatedprotos.WaterUsa" +
      "ge\022Q\n\027GetElectricityUsageById\022\023.generate" +
      "dprotos.ID\032!.generatedprotos.Electricity" +
      "Usage\022M\n\025GetWaterUsageByUserId\022\023.generat" +
      "edprotos.ID\032\037.generatedprotos.ListWaterU" +
      "sage\022Y\n\033GetElectricityUsageByUserId\022\023.ge" +
      "neratedprotos.ID\032%.generatedprotos.ListE" +
      "lectricityUsage2\205\003\n\016UserManagement\022:\n\nCr" +
      "eateUser\022\025.generatedprotos.User\032\025.genera" +
      "tedprotos.User\022>\n\010GetUsers\022\026.generatedpr" +
      "otos.Empty\032\032.generatedprotos.ListUsers\0229" +
      "\n\013GetUserById\022\023.generatedprotos.ID\032\025.gen" +
      "eratedprotos.User\022E\n\021GetUserByUsername\022\031" +
      ".generatedprotos.Username\032\025.generatedpro" +
      "tos.User\022:\n\nUpdateUser\022\025.generatedprotos" +
      ".User\032\025.generatedprotos.User\0229\n\nDeleteUs" +
      "er\022\023.generatedprotos.ID\032\026.generatedproto" +
      "s.Empty2\314\n\n\020AdviceManagement\022^\n\026CreateWa" +
      "terUsageAdvice\022!.generatedprotos.WaterUs" +
      "ageAdvice\032!.generatedprotos.WaterUsageAd" +
      "vice\022p\n\034CreateElectricityUsageAdvice\022\'.g" +
      "eneratedprotos.ElectricityUsageAdvice\032\'." +
      "generatedprotos.ElectricityUsageAdvice\022U" +
      "\n\024GetWaterUsageAdvices\022\026.generatedprotos" +
      ".Empty\032%.generatedprotos.ListWaterUsageA" +
      "dvice\022a\n\032GetElectricityUsageAdvices\022\026.ge" +
      "neratedprotos.Empty\032+.generatedprotos.Li" +
      "stElectricityUsageAdvice\022^\n\026UpdateWaterU" +
      "sageAdvice\022!.generatedprotos.WaterUsageA" +
      "dvice\032!.generatedprotos.WaterUsageAdvice" +
      "\022p\n\034UpdateElectricityUsageAdvice\022\'.gener" +
      "atedprotos.ElectricityUsageAdvice\032\'.gene" +
      "ratedprotos.ElectricityUsageAdvice\022E\n\026De" +
      "leteWaterUsageAdvice\022\023.generatedprotos.I" +
      "D\032\026.generatedprotos.Empty\022K\n\034DeleteElect" +
      "ricityUsageAdvice\022\023.generatedprotos.ID\032\026" +
      ".generatedprotos.Empty\022Q\n\027GetWaterUsageA" +
      "dviceById\022\023.generatedprotos.ID\032!.generat" +
      "edprotos.WaterUsageAdvice\022]\n\035GetElectric" +
      "ityUsageAdviceById\022\023.generatedprotos.ID\032" +
      "\'.generatedprotos.ElectricityUsageAdvice" +
      "\022U\n\027GetWaterAdvicesByUserId\022\023.generatedp" +
      "rotos.ID\032%.generatedprotos.ListWaterUsag" +
      "eAdvice\022a\n\035GetElectricityAdvicesByUserId" +
      "\022\023.generatedprotos.ID\032+.generatedprotos." +
      "ListElectricityUsageAdvice\022f\n\034AssignWate" +
      "rUsageAdviceToUser\022\037.generatedprotos.Adv" +
      "iceCreation\032%.generatedprotos.ListWaterU" +
      "sageAdvice\022r\n\"AssignElectricityUsageAdvi" +
      "ceToUser\022\037.generatedprotos.AdviceCreatio" +
      "n\032+.generatedprotos.ListElectricityUsage" +
      "AdviceB\027\n\023via.generatedprotosP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_generatedprotos_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_generatedprotos_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_User_descriptor,
        new java.lang.String[] { "Id", "Username", "Password", "Role", "Area", });
    internal_static_generatedprotos_ListUsers_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_generatedprotos_ListUsers_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_ListUsers_descriptor,
        new java.lang.String[] { "Users", });
    internal_static_generatedprotos_WaterUsage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_generatedprotos_WaterUsage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_WaterUsage_descriptor,
        new java.lang.String[] { "Id", "Amount", "Month", "Year", "UserId", });
    internal_static_generatedprotos_ElectricityUsage_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_generatedprotos_ElectricityUsage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_ElectricityUsage_descriptor,
        new java.lang.String[] { "Id", "Amount", "Month", "Year", "UserId", });
    internal_static_generatedprotos_WaterUsageAdvice_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_generatedprotos_WaterUsageAdvice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_WaterUsageAdvice_descriptor,
        new java.lang.String[] { "Id", "Body", });
    internal_static_generatedprotos_ElectricityUsageAdvice_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_generatedprotos_ElectricityUsageAdvice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_ElectricityUsageAdvice_descriptor,
        new java.lang.String[] { "Id", "Body", });
    internal_static_generatedprotos_ID_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_generatedprotos_ID_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_ID_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_generatedprotos_Username_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_generatedprotos_Username_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_Username_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_generatedprotos_Empty_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_generatedprotos_Empty_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_Empty_descriptor,
        new java.lang.String[] { });
    internal_static_generatedprotos_ListWaterUsage_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_generatedprotos_ListWaterUsage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_ListWaterUsage_descriptor,
        new java.lang.String[] { "Water", });
    internal_static_generatedprotos_ListElectricityUsage_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_generatedprotos_ListElectricityUsage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_ListElectricityUsage_descriptor,
        new java.lang.String[] { "Electricity", });
    internal_static_generatedprotos_ListWaterUsageAdvice_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_generatedprotos_ListWaterUsageAdvice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_ListWaterUsageAdvice_descriptor,
        new java.lang.String[] { "Water", });
    internal_static_generatedprotos_ListElectricityUsageAdvice_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_generatedprotos_ListElectricityUsageAdvice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_ListElectricityUsageAdvice_descriptor,
        new java.lang.String[] { "Electricity", });
    internal_static_generatedprotos_AdviceCreation_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_generatedprotos_AdviceCreation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_generatedprotos_AdviceCreation_descriptor,
        new java.lang.String[] { "UserId", "AdviceId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
