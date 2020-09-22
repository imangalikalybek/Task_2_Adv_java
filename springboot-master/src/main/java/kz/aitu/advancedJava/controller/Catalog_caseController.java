package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Catalog_case;
import kz.aitu.advancedJava.service.Catalog_caseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Catalog_caseController {
    private final Catalog_caseService catalogCaseService;

    public Catalog_caseController(Catalog_caseService catalogCaseService) {
        this.catalogCaseService = catalogCaseService;
    }

    @GetMapping("/api/Catalog_case")
    public ResponseEntity<?> getCatalog_case(){
        return ResponseEntity.ok(catalogCaseService.getAll());
    }

    @GetMapping("/api/Catalog_case/{id}")
    public ResponseEntity<?> getCatalog_case(@PathVariable Long id){
        return ResponseEntity.ok(catalogCaseService.getById(id));
    }

    @PostMapping("/api/Catalog_case")
    public ResponseEntity<?>  saveCatalog_case(@RequestBody Catalog_case catalogCase){
        return ResponseEntity.ok(catalogCaseService.create(catalogCase));
    }

    @PutMapping("/api/Catalog_case")
    public ResponseEntity<?> updateCatalog_case(@RequestBody Catalog_case catalogCase){
        return ResponseEntity.ok(catalogCaseService.update(catalogCase));
    }

    @DeleteMapping("/api/Catalog_case/{id}")
    public void deleteCatalog_case(@PathVariable Long id) {
        catalogCaseService.delete(id);
    }
}
