package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends CrudRepository<Company,Long> {
}
