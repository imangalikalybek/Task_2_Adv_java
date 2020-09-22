package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Catalog_table;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Catalog_tableRepository extends CrudRepository<Catalog_table,Long> {
}
