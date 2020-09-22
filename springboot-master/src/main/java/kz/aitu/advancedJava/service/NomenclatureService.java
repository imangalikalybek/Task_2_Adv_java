package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Nomenclature;
import kz.aitu.advancedJava.repository.NomenclatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NomenclatureService {
    public final NomenclatureRepository nomenclatureRepository;

    public NomenclatureService(NomenclatureRepository nomenclatureRepository) {
        this.nomenclatureRepository = nomenclatureRepository;
    }

    public List<Nomenclature> getAll() {
        return (List<Nomenclature>) nomenclatureRepository.findAll();
    }

    public Nomenclature getById(Long id) {
        return nomenclatureRepository.findById(id).orElse(null);
    }

    public Nomenclature create(Nomenclature nomenclature) {
        return nomenclatureRepository.save(nomenclature);
    }

    public Nomenclature update(Nomenclature nomenclature) {
        return nomenclatureRepository.save(nomenclature);
    }

    public void delete(Long id) {
        nomenclatureRepository.deleteById(id);
    }
}
