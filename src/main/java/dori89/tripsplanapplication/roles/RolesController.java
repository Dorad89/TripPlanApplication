package dori89.tripsplanapplication.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RolesController {

    private RolesService rolesService;

    @Autowired
    public RolesController(RolesService rolesService) {
        this.rolesService = rolesService;
    }
    @GetMapping(path = "/roles")
    public List<RoleEntity> findAll(){

        return rolesService.findAll();
    }

    @PostMapping(path = "/roles")
    public RoleEntity save(@RequestBody RoleEntity roleEntity){

        return rolesService.save(roleEntity);
    }
}
