package lightheadfox.ru.library_system.service;
import lightheadfox.ru.library_system.domain.User;
import lightheadfox.ru.library_system.domain.UserDTO;
import lightheadfox.ru.library_system.repository.UserStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService implements UserInterface{

    @Autowired
    UserStorage userRepository;


    @Override
    public User getUser(Long id) {
        Optional<User> user = userRepository.findById(id);

        return user.get();
    }

    @Override
    public List<User> getAllUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }

    @Override
    public void addUser(UserDTO userDTO) {
        User newUser = new User(userDTO);
        userRepository.save(newUser);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);

    }

    @Override
    public void updateUser(Long id, UserDTO userDTO) {
        User patchUser = getUser(id);
        patchUser.setUserName(userDTO.getUserName());
        patchUser.setUserSurname(userDTO.getUserSurname());
        patchUser.setUserEmail(userDTO.getUserEmail());
        patchUser.setUserRole(userDTO.getUserRole());


    }
}
