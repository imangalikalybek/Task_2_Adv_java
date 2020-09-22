package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Nomenclature_summary;
import kz.aitu.advancedJava.repository.Nomenclature_summaryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Nomenclature_summaryService {
    public final Nomenclature_summaryRepository nomenclatureSummaryRepository;

    public Nomenclature_summaryService(Nomenclature_summaryRepository nomenclatureSummaryRepository) {
        this.nomenclatureSummaryRepository = nomenclatureSummaryRepository;
    }

    public List<Nomenclature_summary> getAll() {
        return (List<Nomenclature_summary>) nomenclatureSummaryRepository.findAll();
    }

    public Nomenclature_summary getById(Long id) {
        return nomenclatureSummaryRepository.findById(id).orElse(null);
    }

    public Nomenclature_summary create(Nomenclature_summary nomenclatureSummary) {
        return nomenclatureSummaryRepository.save(nomenclatureSummary);
    }

    public Nomenclature_summary update(Nomenclature_summary nomenclatureSummary) {
        return nomenclatureSummaryRepository.save(nomenclatureSummary);
    }

    public void delete(Long id) {
        nomenclatureSummaryRepository.deleteById(id);
    }
}
