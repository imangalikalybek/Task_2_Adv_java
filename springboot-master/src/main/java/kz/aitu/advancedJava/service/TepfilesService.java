package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Tepfiles;
import kz.aitu.advancedJava.repository.TepfilesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TepfilesService {
    public final TepfilesRepository tepfilesRepository;

    public TepfilesService(TepfilesRepository tepfilesRepository) {
        this.tepfilesRepository = tepfilesRepository;
    }

    public List<Tepfiles> getAll() {
        return (List<Tepfiles>) tepfilesRepository.findAll();
    }

    public Tepfiles getById(Long id) {
        return tepfilesRepository.findById(id).orElse(null);
    }

    public Tepfiles create(Tepfiles tepfiles) {
        return tepfilesRepository.save(tepfiles);
    }

    public Tepfiles update(Tepfiles tepfiles) {
        return tepfilesRepository.save(tepfiles);
    }

    public void delete(Long id) {
        tepfilesRepository.deleteById(id);
    }
}
