package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.File_routing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface File_routingRepository extends CrudRepository<File_routing,Long> {
}
