package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Nomenclature_summary;
import kz.aitu.advancedJava.service.Nomenclature_summaryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Nomenclature_summaryController {
    private final Nomenclature_summaryService nomenclature_summaryService;

    public Nomenclature_summaryController(Nomenclature_summaryService nomenclature_summaryService) {
        this.nomenclature_summaryService = nomenclature_summaryService;
    }

    @GetMapping("/api/Nomenclature_summary")
    public ResponseEntity<?> getNomenclature_summary(){
        return ResponseEntity.ok(nomenclature_summaryService.getAll());
    }

    @GetMapping("/api/Nomenclature_summary/{id}")
    public ResponseEntity<?> getNomenclature_summary(@PathVariable Long id){
        return ResponseEntity.ok(nomenclature_summaryService.getById(id));
    }

    @PostMapping("/api/Nomenclature_summary")
    public ResponseEntity<?>  saveNomenclature_summary(@RequestBody Nomenclature_summary nomenclatureSummary){
        return ResponseEntity.ok(nomenclature_summaryService.create(nomenclatureSummary));
    }

    @PutMapping("/api/Nomenclature_summary")
    public ResponseEntity<?> updateNomenclature_summary(@RequestBody Nomenclature_summary nomenclatureSummary){
        return ResponseEntity.ok(nomenclature_summaryService.update(nomenclatureSummary));
    }

    @DeleteMapping("/api/Nomenclature_summary/{id}")
    public void deleteAuth(@PathVariable Long id) {
        nomenclature_summaryService.delete(id);
    }
}
