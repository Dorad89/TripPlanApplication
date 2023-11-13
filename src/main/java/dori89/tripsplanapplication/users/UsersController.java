package dori89.tripsplanapplication.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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

    @PostMapping(path = "/users")
    public UserEntity save(@RequestBody UserEntity userEntity){

        return usersRepository.save(userEntity);
    }

    @GetMapping(path = "/users", params = "name")
    public Set<UserEntity> findByName(@RequestParam String name){

        return usersRepository.findByFirstNameIgnoreCase(name);
    }
}
