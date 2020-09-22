package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.File_routing;
import kz.aitu.advancedJava.repository.File_routingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class File_routingService {
    public final File_routingRepository fileRoutingRepository;

    public File_routingService(File_routingRepository fileRoutingRepository) {
        this.fileRoutingRepository = fileRoutingRepository;
    }


    public List<File_routing> getAll() {
        return (List<File_routing>) fileRoutingRepository.findAll();
    }

    public File_routing getById(Long id) {
        return fileRoutingRepository.findById(id).orElse(null);
    }

    public File_routing create(File_routing fileRouting) {
        return fileRoutingRepository.save(fileRouting);
    }

    public File_routing update(File_routing fileRouting) {
        return fileRoutingRepository.save(fileRouting);
    }

    public void delete(Long id) {
        fileRoutingRepository.deleteById(id);
    }
}
