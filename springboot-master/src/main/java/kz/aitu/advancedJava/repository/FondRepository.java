package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Fond;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FondRepository extends CrudRepository<Fond,Long> {
}
