package kz.aitu.advancedJava.service;

import java.util.List;
import kz.aitu.advancedJava.model.Activate_journal;
import kz.aitu.advancedJava.repository.Activate_journalRepository;
import org.springframework.stereotype.Service;

@Service
public class Activate_jurnalService {
    public final Activate_journalRepository activateJournalRepository;

    public Activate_jurnalService(Activate_journalRepository activateJournalRepository) {
        this.activateJournalRepository = activateJournalRepository;
    }

    public List<Activate_journal> getAll() {
        return (List<Activate_journal>) activateJournalRepository.findAll();
    }

    public Activate_journal getById(Long id) {
        return activateJournalRepository.findById(id).orElse(null);
    }

    public Activate_journal create(Activate_journal student) {
        return activateJournalRepository.save(student);
    }

    public Activate_journal update(Activate_journal student) {
        return activateJournalRepository.save(student);
    }

    public void delete(Long id) {
        activateJournalRepository.deleteById(id);
    }


}
