package dori89.tripsplanapplication.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {

    private UserRepository userRepository;
    @Autowired
    public UsersController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/users")
    public List<UserEntity> findAll() {

        return userRepository.findAll();
    }
    @GetMapping(path = "/users/{id}")
    public UserEntity findById(@PathVariable long id){

        Optional<UserEntity> userEntityOptional = userRepository.findById(id);

        if (userEntityOptional.isPresent()){
           return userEntityOptional.get();
        }
        return null;
    }
}
