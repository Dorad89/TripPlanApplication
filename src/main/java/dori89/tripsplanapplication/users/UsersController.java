package dori89.tripsplanapplication.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class UsersController {

    private UsersRepository usersRepository;
    @Autowired
    public UsersController(UsersRepository usersRepository) {

        this.usersRepository = usersRepository;
    }

    @GetMapping(path = "/users")
    public List<UserEntity> findAll() {

        return usersRepository.findAll();
    }
    @GetMapping(path = "/users/{id}")
    public UserEntity findById(@PathVariable long id){

        Optional<UserEntity> userEntityOptional = usersRepository.findById(id);

        return userEntityOptional.orElse(null);
    }
}
