package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Case_index;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Case_indexRepository extends CrudRepository<Case_index,Long> {
}
