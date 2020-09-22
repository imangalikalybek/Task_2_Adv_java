package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Record;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<Record,Long> {
}
