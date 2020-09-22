package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Nomenclature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NomenclatureRepository extends CrudRepository<Nomenclature,Long> {
}
