package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Case1;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Case1Repository extends CrudRepository<Case1,Long> {
}
