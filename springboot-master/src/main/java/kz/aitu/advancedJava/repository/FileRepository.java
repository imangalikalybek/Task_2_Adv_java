package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.File;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends CrudRepository<File,Long> {
}
