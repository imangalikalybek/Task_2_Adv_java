package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Tepfiles;
import kz.aitu.advancedJava.service.TepfilesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TepfilesController {
    private final TepfilesService tepfilesService;

    public TepfilesController(TepfilesService tepfilesService) {
        this.tepfilesService = tepfilesService;
    }

    @GetMapping("/api/Tepfiles")
    public ResponseEntity<?> getTepfiles(){
        return ResponseEntity.ok(tepfilesService.getAll());
    }

    @GetMapping("/api/Tepfiles/{id}")
    public ResponseEntity<?> getTepfiles(@PathVariable Long id){
        return ResponseEntity.ok(tepfilesService.getById(id));
    }

    @PostMapping("/api/Tepfiles")
    public ResponseEntity<?>  saveTepfiles(@RequestBody Tepfiles tepfiles){
        return ResponseEntity.ok(tepfilesService.create(tepfiles));
    }

    @PutMapping("/api/Tepfiles")
    public ResponseEntity<?> updateTepfiles(@RequestBody Tepfiles tepfiles){
        return ResponseEntity.ok(tepfilesService.update(tepfiles));
    }

    @DeleteMapping("/api/Tepfiles/{id}")
    public void deleteTepfiles(@PathVariable Long id) {
        tepfilesService.delete(id);
    }
}
