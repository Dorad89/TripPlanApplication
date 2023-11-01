package dori89.tripsplanapplication.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class usersController {

    @GetMapping(path = "/users")
    public String getUser() {
        return "Dorad Ulqinaku";
    }
}
