package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Search_key_routing;
import kz.aitu.advancedJava.service.Search_key_routingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Search_key_routingController {
    private final Search_key_routingService searchKeyRoutingService;

    public Search_key_routingController(Search_key_routingService searchKeyRoutingService) {
        this.searchKeyRoutingService = searchKeyRoutingService;
    }

    @GetMapping("/api/Search_key_routing")
    public ResponseEntity<?> getSearch_key_routing(){
        return ResponseEntity.ok(searchKeyRoutingService.getAll());
    }

    @GetMapping("/api/Search_key_routing/{id}")
    public ResponseEntity<?> getSearch_key_routing(@PathVariable Long id){
        return ResponseEntity.ok(searchKeyRoutingService.getById(id));
    }

    @PostMapping("/api/Search_key_routing")
    public ResponseEntity<?>  saveSearch_key_routing(@RequestBody Search_key_routing searchKeyRouting){
        return ResponseEntity.ok(searchKeyRoutingService.create(searchKeyRouting));
    }

    @PutMapping("/api/Search_key_routing")
    public ResponseEntity<?> updateSearch_key_routing(@RequestBody Search_key_routing searchKeyRouting){
        return ResponseEntity.ok(searchKeyRoutingService.update(searchKeyRouting));
    }

    @DeleteMapping("/api/Search_key_routing/{id}")
    public void deleteSearch_key_routing(@PathVariable Long id) {
        searchKeyRoutingService.delete(id);
    }
}
