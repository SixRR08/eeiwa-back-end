package lt.sdacademy.eeiwa.repositories;

import lt.sdacademy.eeiwa.models.entities.UserEntity;
import org.springframework.data.repository.Repository;

public interface UserRepository extends Repository<UserEntity, Long> {

    UserEntity findOneById(Long id);

    UserEntity findOneByEmail(String Email);

    UserEntity save(UserEntity userEntity);
}
