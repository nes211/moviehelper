package pl.tdelektro.carhelper.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tdelektro.carhelper.pojo.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
