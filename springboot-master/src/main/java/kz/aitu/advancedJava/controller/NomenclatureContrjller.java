package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Nomenclature;
import kz.aitu.advancedJava.service.NomenclatureService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NomenclatureContrjller {
    private final NomenclatureService nomenclatureService;

    public NomenclatureContrjller(NomenclatureService nomenclatureService) {
        this.nomenclatureService = nomenclatureService;
    }

    @GetMapping("/api/Nomenclature")
    public ResponseEntity<?> getNomenclature(){
        return ResponseEntity.ok(nomenclatureService.getAll());
    }

    @GetMapping("/api/Nomenclature/{id}")
    public ResponseEntity<?> getNomenclature(@PathVariable Long id){
        return ResponseEntity.ok(nomenclatureService.getById(id));
    }

    @PostMapping("/api/Nomenclature")
    public ResponseEntity<?>  saveNomenclature(@RequestBody Nomenclature nomenclature){
        return ResponseEntity.ok(nomenclatureService.create(nomenclature));
    }

    @PutMapping("/api/Nomenclature")
    public ResponseEntity<?> updateNomenclature(@RequestBody Nomenclature nomenclature){
        return ResponseEntity.ok(nomenclatureService.update(nomenclature));
    }

    @DeleteMapping("/api/Nomenclature/{id}")
    public void deleteNomenclature(@PathVariable Long id) {
        nomenclatureService.delete(id);
    }
}

