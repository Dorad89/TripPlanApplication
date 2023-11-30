package dori89.tripsplanapplication.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class UsersServiceImpl implements UsersService {

    private UsersRepository usersRepository;

    @Autowired
    public UsersServiceImpl(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public List<UserEntity> findAll() {
        return usersRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(long id) {
        return usersRepository.findById(id);
    }

    @Override
    public UserEntity save(UserEntity userEntity) {
        return usersRepository.save(userEntity);
    }

    @Override
    public Set<UserEntity> findByName(String name) {
        return usersRepository.findByFirstNameIgnoreCase(name);
    }

    @Override
    public void deleteById(long id) {

        Optional<UserEntity> userEntityOptional = usersRepository.findById(id);

        if (userEntityOptional.isPresent()){

            //userRepository.deleteById(id);
            UserEntity userEntity = userEntityOptional.get();
            userEntity.setUpdatedAt(new Timestamp(System.currentTimeMillis()));
            userEntity.setStatus("Deleted");
            usersRepository.save(userEntity);
        }
    }
}
