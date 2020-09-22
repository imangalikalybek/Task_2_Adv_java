package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Search_key_routing;
import kz.aitu.advancedJava.repository.Search_key_routingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Search_key_routingService {
    public final Search_key_routingRepository searchKeyRoutingRepository;

    public Search_key_routingService(Search_key_routingRepository searchKeyRoutingRepository) {
        this.searchKeyRoutingRepository = searchKeyRoutingRepository;
    }


    public List<Search_key_routing> getAll() {
        return (List<Search_key_routing>) searchKeyRoutingRepository.findAll();
    }

    public Search_key_routing getById(Long id) {
        return searchKeyRoutingRepository.findById(id).orElse(null);
    }

    public Search_key_routing create(Search_key_routing searchKeyRouting) {
        return searchKeyRoutingRepository.save(searchKeyRouting);
    }

    public Search_key_routing update(Search_key_routing searchKeyRouting) {
        return searchKeyRoutingRepository.save(searchKeyRouting);
    }

    public void delete(Long id) {
        searchKeyRoutingRepository.deleteById(id);
    }
}
