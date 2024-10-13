package lightheadfox.ru.library_system.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    }



    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String userSurname;

    @Column(nullable = false)
    private String userEmail;

    @Column(nullable = false)
    private int userAge;

    @Column(nullable = false)
    private int userPhone;

    // TODO перевести роль на ENUM

    @Column(nullable = false)
    private String userRole;


}
