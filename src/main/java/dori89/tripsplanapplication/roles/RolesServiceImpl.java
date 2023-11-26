package dori89.tripsplanapplication.roles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolesServiceImpl implements RolesService {

    private RolesRepository rolesRepository;
    @Autowired
    public RolesServiceImpl(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    @Override
    public List<RoleEntity> findAll() {
        return rolesRepository.findAll();
    }

    @Override
    public RoleEntity save(RoleEntity roleEntity) {
        return rolesRepository.save(roleEntity);
    }
}
