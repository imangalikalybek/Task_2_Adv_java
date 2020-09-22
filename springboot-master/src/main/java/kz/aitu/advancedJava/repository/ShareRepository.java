package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Share;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShareRepository extends CrudRepository<Share,Long> {
}
