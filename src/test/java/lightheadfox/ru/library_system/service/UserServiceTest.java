package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.UserDTO;
import lightheadfox.ru.library_system.domain.User;
import lightheadfox.ru.library_system.repository.UserStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Mock
    private UserStorage userRepository;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetUser() {
        Long userId = 1L;
        User user = new User();
        user.setId(userId);
        when(userRepository.findById(userId)).thenReturn(Optional.of(user));

        User result = userService.getUser(userId);

        assertNotNull(result);
        assertEquals(userId, result.getId());
        verify(userRepository, times(1)).findById(userId);
    }

    @Test
    public void testGetAllUsers() {
        List<User> users = Arrays.asList(new User(), new User());
        when(userRepository.findAll()).thenReturn(users);

        List<User> result = userService.getAllUsers();

        assertEquals(2, result.size());
        verify(userRepository, times(1)).findAll();
    }

    @Test
    public void testAddUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("Ivan");
        userDTO.setUserSurname("Ivanovich");




        userService.addUser(userDTO);


        verify(userRepository, times(1)).save(any(User.class));
    }

    @Test
    public void testDeleteUser() {
        Long userId = 1L;

        userService.deleteUser(userId);

        verify(userRepository, times(1)).deleteById(userId);
    }

    @Test
    public void testUpdateUser() {
        Long userId = 1L;
        User user = new User();
        user.setId(userId);
        when(userRepository.findById(userId)).thenReturn(Optional.of(user));

        UserDTO userDTO = new UserDTO();
        userDTO.setUserName("Ivan");
        userDTO.setUserSurname("Ivanovich");
        userDTO.setUserEmail("user@gmail.com");
        userDTO.setUserRole("User");



        userService.updateUser(userId, userDTO);


        assertEquals("Ivan", user.getUserName());
        assertEquals("Ivanovich", user.getUserSurname());
        assertEquals("user@gmail.com", user.getUserEmail());
        assertEquals("User", user.getUserRole());



        verify(userRepository, times(1)).save(user);
    }
}