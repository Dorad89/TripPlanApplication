package dori89.tripsplanapplication.roles;

import java.util.List;

public interface RolesService {
    List<RoleEntity> findAll();

    RoleEntity save(RoleEntity roleEntity);
}
