package pl.tdelektro.carhelper.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tdelektro.carhelper.pojo.UserDTO;

public interface UserRepository extends CrudRepository<UserDTO, Long> {
}
