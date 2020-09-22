package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Searchkey;
import kz.aitu.advancedJava.repository.SearchkeyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchkeyService {
    public final SearchkeyRepository searchkeyRepository;

    public SearchkeyService(SearchkeyRepository searchkeyRepository) {
        this.searchkeyRepository = searchkeyRepository;
    }

    public List<Searchkey> getAll() {
        return (List<Searchkey>) searchkeyRepository.findAll();
    }

    public Searchkey getById(Long id) {
        return searchkeyRepository.findById(id).orElse(null);
    }

    public Searchkey create(Searchkey searchkey) {
        return searchkeyRepository.save(searchkey);
    }

    public Searchkey update(Searchkey searchkey) {
        return searchkeyRepository.save(searchkey);
    }

    public void delete(Long id) {
        searchkeyRepository.deleteById(id);
    }
}
