package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Catalog_case;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Catalog_caseRepository extends CrudRepository<Catalog_case,Long> {
}
