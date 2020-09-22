package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Destruction_act;
import kz.aitu.advancedJava.repository.Destruction_actRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Destruction_actService {
    public final Destruction_actRepository destructionActRepository;

    public Destruction_actService(Destruction_actRepository destructionActRepository) {
        this.destructionActRepository = destructionActRepository;
    }


    public List<Destruction_act> getAll() {
        return (List<Destruction_act>) destructionActRepository.findAll();
    }

    public Destruction_act getById(Long id) {
        return destructionActRepository.findById(id).orElse(null);
    }

    public Destruction_act create(Destruction_act destructionAct) {
        return destructionActRepository.save(destructionAct);
    }

    public Destruction_act update(Destruction_act destructionAct) {
        return destructionActRepository.save(destructionAct);
    }

    public void delete(Long id) {
        destructionActRepository.deleteById(id);
    }
}
