package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Searchkey;
import kz.aitu.advancedJava.service.SearchkeyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SearchkeyController {
    private final SearchkeyService searchkeyService;

    public SearchkeyController(SearchkeyService searchkeyService) {
        this.searchkeyService = searchkeyService;
    }

    @GetMapping("/api/Searchkey")
    public ResponseEntity<?> getSearchkey(){
        return ResponseEntity.ok(searchkeyService.getAll());
    }

    @GetMapping("/api/Searchkey/{id}")
    public ResponseEntity<?> getSearchkey(@PathVariable Long id){
        return ResponseEntity.ok(searchkeyService.getById(id));
    }

    @PostMapping("/api/Searchkey")
    public ResponseEntity<?>  saveSearchkey(@RequestBody Searchkey searchkey){
        return ResponseEntity.ok(searchkeyService.create(searchkey));
    }

    @PutMapping("/api/Searchkey")
    public ResponseEntity<?> updateSearchkey(@RequestBody Searchkey searchkey){
        return ResponseEntity.ok(searchkeyService.update(searchkey));
    }

    @DeleteMapping("/api/Searchkey/{id}")
    public void deleteSearchkey(@PathVariable Long id) {
        searchkeyService.delete(id);
    }
}
