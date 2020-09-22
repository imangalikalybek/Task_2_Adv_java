package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Status_request_history;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Status_request_historyRepository extends CrudRepository<Status_request_history,Long> {
}
