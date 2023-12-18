package dori89.tripsplanapplication.users;

import dori89.tripsplanapplication.users.models.UserEntity;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface UsersService {

    List<UserEntity> findAll();
    Optional<UserEntity> findById(long id);
    UserEntity save(UserEntity userEntity);
    Set<UserEntity> findByName(String name);

    void deleteById(long id);
}
