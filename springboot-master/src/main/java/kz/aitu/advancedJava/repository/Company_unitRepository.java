package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Company_unit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Company_unitRepository extends CrudRepository<Company_unit,Long> {
}
