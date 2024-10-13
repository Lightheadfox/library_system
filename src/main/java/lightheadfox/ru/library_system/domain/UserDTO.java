package lightheadfox.ru.library_system.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class UserDTO {

    private String userName;

    private String userSurname;

    private String userEmail;

    private String userRole;



}
