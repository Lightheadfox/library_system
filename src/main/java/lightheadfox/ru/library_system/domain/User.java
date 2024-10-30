package lightheadfox.ru.library_system.domain;


import at.favre.lib.crypto.bcrypt.BCrypt;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lightheadfox.ru.library_system.domain.ENUMS.Roles;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;




import java.time.Instant;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@Getter
@Setter
/*
// Подход к юзерам был выбран такой - чтобы не плодить лишние таблицы
// все юзеры библиотеки распределены по ролям внутри единой базы данных
//
//
//
//
 */


public class User {



    public User(UserDTO userDTO) {
        this.userName = userDTO.getUserName();
        this.userSurname = userDTO.getUserSurname();
        this.userEmail = userDTO.getUserEmail();
        this.userRole = userDTO.getUserRole();

        String encodedPassword = BCrypt.withDefaults().hashToString(10, userDTO.getPassword().toCharArray());
        System.out.println(encodedPassword);
        this.password = encodedPassword;
    }



    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String userSurname;

    @Email
    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private int userAge;

    @Column(nullable = false)
    private int userPhone;

    @Column(nullable = false)
    private Roles userRole;

    @Column(nullable = false)
    private String password;

    @CreationTimestamp
    @Column(nullable = false)
    private LocalDateTime creationDate;


}
