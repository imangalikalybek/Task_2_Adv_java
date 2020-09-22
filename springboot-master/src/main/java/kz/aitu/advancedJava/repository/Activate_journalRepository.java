package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Activate_journal;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Activate_journalRepository extends CrudRepository<Activate_journal,Long> {

}
