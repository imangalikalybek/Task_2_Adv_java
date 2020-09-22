package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends CrudRepository<Users,Long> {
}
