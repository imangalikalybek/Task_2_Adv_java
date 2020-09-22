package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Catalog_case;
import kz.aitu.advancedJava.repository.Catalog_caseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Catalog_caseService {
    public final Catalog_caseRepository catalogCaseRepository;

    public Catalog_caseService(Catalog_caseRepository catalogCaseRepository) {
        this.catalogCaseRepository = catalogCaseRepository;
    }

    public List<Catalog_case> getAll() {
        return (List<Catalog_case>) catalogCaseRepository.findAll();
    }

    public Catalog_case getById(Long id) {
        return catalogCaseRepository.findById(id).orElse(null);
    }

    public Catalog_case create(Catalog_case catalogCase) {
        return catalogCaseRepository.save(catalogCase);
    }

    public Catalog_case update(Catalog_case catalogCase) {
        return catalogCaseRepository.save(catalogCase);
    }

    public void delete(Long id) {
        catalogCaseRepository.deleteById(id);
    }
}
