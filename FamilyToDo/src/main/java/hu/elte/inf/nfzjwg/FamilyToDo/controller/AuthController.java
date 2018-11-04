package hu.elte.inf.nfzjwg.FamilyToDo.controller;

import hu.elte.inf.nfzjwg.FamilyToDo.model.User;
import hu.elte.inf.nfzjwg.FamilyToDo.repository.UserRepository;
import hu.elte.inf.nfzjwg.FamilyToDo.service.SessionService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
    
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private SessionService sessionService;
 //   @Autowired
 //   private PasswordEncoder passwordEncoder;
    
     /**
     * This function logs in.
     * @return a status.
     */
    @RequestMapping("/login")
    public ResponseEntity<User> login(@RequestBody User user) {
        Optional<User> currentUser = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
        if(currentUser.isPresent()) {
            System.out.println("Login successful!");
            sessionService.setCurrentUser(currentUser.get());
            return ResponseEntity.ok(currentUser.get());
        } else {
            System.out.println("Login failed.");
            return ResponseEntity.status(403).build();
        }
    }
    
     /**
     * This function logs out.
     * @return a status.
     */
    @RequestMapping("/logout")
    public ResponseEntity logout() {
        sessionService.setCurrentUser(null);
        return ResponseEntity.ok(false);
    }
    
     /**
     * This function returns current user.
     * @return a user.
     */
    @GetMapping("/user")
    public ResponseEntity getUser() {
        if (sessionService.getCurrentUser() == null) {
            return ResponseEntity.ok(false);
        } else {
            return ResponseEntity.ok(sessionService.getCurrentUser());
        }
    }
}
