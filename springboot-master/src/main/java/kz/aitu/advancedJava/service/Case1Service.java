package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Case1;
import kz.aitu.advancedJava.repository.Case1Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Case1Service {
    public final Case1Repository case1Repository;

    public Case1Service(Case1Repository case1Repository) {
        this.case1Repository = case1Repository;
    }

    public List<Case1> getAll() {
        return (List<Case1>) case1Repository.findAll();
    }

    public Case1 getById(Long id) {
        return case1Repository.findById(id).orElse(null);
    }

    public Case1 create(Case1 case1) {
        return case1Repository.save(case1);
    }

    public Case1 update(Case1 case1) {
        return case1Repository.save(case1);
    }

    public void delete(Long id) {
        case1Repository.deleteById(id);
    }

}
