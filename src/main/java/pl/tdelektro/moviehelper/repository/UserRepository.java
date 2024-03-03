package pl.tdelektro.moviehelper.repository;

import org.springframework.data.repository.CrudRepository;
import pl.tdelektro.moviehelper.pojo.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
