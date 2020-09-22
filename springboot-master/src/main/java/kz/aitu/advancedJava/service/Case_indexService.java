package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Case_index;
import kz.aitu.advancedJava.repository.Case_indexRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Case_indexService {
    public final Case_indexRepository caseIndexRepository;

    public Case_indexService(Case_indexRepository caseIndexRepository) {
        this.caseIndexRepository = caseIndexRepository;
    }

    public List<Case_index> getAll() {
        return (List<Case_index>) caseIndexRepository.findAll();
    }

    public Case_index getById(Long id) {
        return caseIndexRepository.findById(id).orElse(null);
    }

    public Case_index create(Case_index caseIndex) {
        return caseIndexRepository.save(caseIndex);
    }

    public Case_index update(Case_index caseIndex) {
        return caseIndexRepository.save(caseIndex);
    }

    public void delete(Long id) {
        caseIndexRepository.deleteById(id);
    }
}
