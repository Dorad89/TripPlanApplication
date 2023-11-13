package dori89.tripsplanapplication.users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long>{

    Set<UserEntity> findByFirstNameIgnoreCase(String name);

}
