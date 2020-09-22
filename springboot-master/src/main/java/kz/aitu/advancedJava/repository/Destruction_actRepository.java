package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Destruction_act;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Destruction_actRepository extends CrudRepository<Destruction_act,Long> {
}
