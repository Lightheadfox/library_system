package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.User;
import lightheadfox.ru.library_system.domain.UserDTO;

import java.util.List;

public interface UserInterface {

    User getUser(Long id);

    List<User> getAllUsers();

    void addUser(UserDTO userDTO);

    void deleteUser(Long id);

    void updateUser(Long id, UserDTO userDTO);


}
