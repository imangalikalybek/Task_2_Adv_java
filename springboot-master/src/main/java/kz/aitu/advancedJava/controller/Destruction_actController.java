package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Destruction_act;
import kz.aitu.advancedJava.service.Destruction_actService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Destruction_actController {
    private final Destruction_actService destructionActService;

    public Destruction_actController(Destruction_actService destructionActService) {
        this.destructionActService = destructionActService;
    }

    @GetMapping("/api/Destruction_act")
    public ResponseEntity<?> getDestruction_act(){
        return ResponseEntity.ok(destructionActService.getAll());
    }

    @GetMapping("/api/Destruction_act/{id}")
    public ResponseEntity<?> getDestruction_act(@PathVariable Long id){
        return ResponseEntity.ok(destructionActService.getById(id));
    }

    @PostMapping("/api/Destruction_act")
    public ResponseEntity<?>  saveDestruction_act(@RequestBody Destruction_act destructionAct){
        return ResponseEntity.ok(destructionActService.create(destructionAct));
    }

    @PutMapping("/api/Destruction_act")
    public ResponseEntity<?> updateDestruction_act(@RequestBody Destruction_act destructionAct){
        return ResponseEntity.ok(destructionActService.update(destructionAct));
    }

    @DeleteMapping("/api/Destruction_act/{id}")
    public void deleteDestruction_act(@PathVariable Long id) {
        destructionActService.delete(id);
    }
}
