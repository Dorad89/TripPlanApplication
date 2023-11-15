package dori89.tripsplanapplication.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class UsersController {

    private UsersService usersService;
    @Autowired
    public UsersController(UsersService usersService) {

        this.usersService = usersService;
    }

    @GetMapping(path = "/users")
    public List<UserEntity> findAll() {

        return usersService.findAll();
    }
    @GetMapping(path = "/users/{id}")
    public UserEntity findById(@PathVariable long id){

        Optional<UserEntity> userEntityOptional = usersService.findById(id);

        return userEntityOptional.orElse(null);
    }

    @PostMapping(path = "/users")
    public UserEntity save(@RequestBody UserEntity userEntity){

        return usersService.save(userEntity);
    }

    @GetMapping(path = "/users", params = "name")
    public Set<UserEntity> findByName(@RequestParam String name){

        return usersService.findByName(name);
    }
}
