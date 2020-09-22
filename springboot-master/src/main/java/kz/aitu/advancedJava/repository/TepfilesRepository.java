package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Tepfiles;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TepfilesRepository extends CrudRepository<Tepfiles,Long> {
}
