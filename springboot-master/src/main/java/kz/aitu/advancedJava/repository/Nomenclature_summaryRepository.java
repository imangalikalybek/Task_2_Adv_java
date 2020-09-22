package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Nomenclature_summary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Nomenclature_summaryRepository extends CrudRepository<Nomenclature_summary,Long> {
}
