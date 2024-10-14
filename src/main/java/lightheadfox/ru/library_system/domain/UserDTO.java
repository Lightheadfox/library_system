package lightheadfox.ru.library_system.domain;


import lightheadfox.ru.library_system.domain.ENUMS.Roles;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
public class UserDTO {

    private String userName;

    private String userSurname;

    private String userEmail;

    private int userAge;

    private int userPhone;

    private Roles userRole;

    private String password;

    private LocalDateTime creationDate;

    



}
