package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Fond;
import kz.aitu.advancedJava.repository.FondRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FondService {
    public final FondRepository fondRepository;

    public FondService(FondRepository fondRepository) {
        this.fondRepository = fondRepository;
    }

    public List<Fond> getAll() {
        return (List<Fond>) fondRepository.findAll();
    }

    public Fond getById(Long id) {
        return fondRepository.findById(id).orElse(null);
    }

    public Fond create(Fond fond) {
        return fondRepository.save(fond);
    }

    public Fond update(Fond fond) {
        return fondRepository.save(fond);
    }

    public void delete(Long id) {
        fondRepository.deleteById(id);
    }
}
