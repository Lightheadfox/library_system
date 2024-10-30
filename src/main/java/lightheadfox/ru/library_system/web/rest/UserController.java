package lightheadfox.ru.library_system.web.rest;

import lightheadfox.ru.library_system.domain.User;
import lightheadfox.ru.library_system.domain.UserDTO;
import lightheadfox.ru.library_system.service.UserInterface;
import lightheadfox.ru.library_system.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserController extends BaseController {
    private UserInterface userService;

    public UserController(UserService userService) {
        super();
        System.out.println("UserController initialized");
        this.userService = userService;

    }

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
        userService.addUser(userDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userService.getUser(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<?> getAllUsers() {
        List<User> users = userService.getAllUsers();
        ResponseEntity<List<User>> entity = new ResponseEntity<>(users, HttpStatus.OK);
        return entity;
    }

    @PatchMapping("/user/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody UserDTO userDTO) {
        userService.updateUser(id, userDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }




}
