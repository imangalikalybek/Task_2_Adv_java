package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Search_key_routing;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Search_key_routingRepository extends CrudRepository<Search_key_routing,Long> {
}
