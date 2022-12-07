package via.sep3.tier2.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterCredentials
{
    private String username;
    private String password;
    private int role;
    private int area;
}
