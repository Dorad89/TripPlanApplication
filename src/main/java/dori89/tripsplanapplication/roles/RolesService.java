package dori89.tripsplanapplication.roles;

import dori89.tripsplanapplication.roles.models.RoleEntity;

import java.util.List;

public interface RolesService {
    List<RoleEntity> findAll();

    RoleEntity save(RoleEntity roleEntity);
}
