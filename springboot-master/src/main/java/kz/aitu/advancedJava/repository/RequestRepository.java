package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Request;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request,Long> {
}
