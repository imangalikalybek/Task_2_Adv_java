package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Fond;
import kz.aitu.advancedJava.service.FondService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FondController {
    private final FondService fondService;

    public FondController(FondService fondService) {
        this.fondService = fondService;
    }

    @GetMapping("/api/Fond")
    public ResponseEntity<?> getFond(){
        return ResponseEntity.ok(fondService.getAll());
    }

    @GetMapping("/api/Fond/{id}")
    public ResponseEntity<?> getFond(@PathVariable Long id){
        return ResponseEntity.ok(fondService.getById(id));
    }

    @PostMapping("/api/Fond")
    public ResponseEntity<?>  saveFond(@RequestBody Fond fond){
        return ResponseEntity.ok(fondService.create(fond));
    }

    @PutMapping("/api/Fond")
    public ResponseEntity<?> updateFond(@RequestBody Fond fond){
        return ResponseEntity.ok(fondService.update(fond));
    }

    @DeleteMapping("/api/Fond/{id}")
    public void deleteFond(@PathVariable Long id) {
        fondService.delete(id);
    }
}
