package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Catalog_table;
import kz.aitu.advancedJava.repository.Catalog_tableRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Catalog_tableService {
    public final Catalog_tableRepository catalogTableRepository;

    public Catalog_tableService(Catalog_tableRepository catalogTableRepository) {
        this.catalogTableRepository = catalogTableRepository;
    }


    public List<Catalog_table> getAll() {
        return (List<Catalog_table>) catalogTableRepository.findAll();
    }

    public Catalog_table getById(Long id) {
        return catalogTableRepository.findById(id).orElse(null);
    }

    public Catalog_table create(Catalog_table catalogTable) {
        return catalogTableRepository.save(catalogTable);
    }

    public Catalog_table update(Catalog_table catalogTable) {
        return catalogTableRepository.save(catalogTable);
    }

    public void delete(Long id) {
        catalogTableRepository.deleteById(id);
    }
}
