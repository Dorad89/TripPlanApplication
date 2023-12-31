package dori89.tripsplanapplication.roles;

import dori89.tripsplanapplication.roles.models.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<RoleEntity, Long> {
}
