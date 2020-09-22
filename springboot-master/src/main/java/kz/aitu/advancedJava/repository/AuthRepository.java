package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Auth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRepository extends CrudRepository<Auth,Long> {

}
