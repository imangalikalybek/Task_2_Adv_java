package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Catalog_table;
import kz.aitu.advancedJava.service.Catalog_tableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Catalog_tableController {
    private final Catalog_tableService catalogTableService;

    public Catalog_tableController(Catalog_tableService catalogTableService) {
        this.catalogTableService = catalogTableService;
    }

    @GetMapping("/api/Catalog_table")
    public ResponseEntity<?> getCatalog_table(){
        return ResponseEntity.ok(catalogTableService.getAll());
    }

    @GetMapping("/api/Catalog_table/{id}")
    public ResponseEntity<?> getCatalog_table(@PathVariable Long id){
        return ResponseEntity.ok(catalogTableService.getById(id));
    }

    @PostMapping("/api/Catalog_table")
    public ResponseEntity<?>  saveCatalog_table(@RequestBody Catalog_table catalogTable){
        return ResponseEntity.ok(catalogTableService.create(catalogTable));
    }

    @PutMapping("/api/Catalog_table")
    public ResponseEntity<?> updateCatalog_table(@RequestBody Catalog_table catalogTable){
        return ResponseEntity.ok(catalogTableService.update(catalogTable));
    }

    @DeleteMapping("/api/Catalog_table/{id}")
    public void deleteCatalog_table(@PathVariable Long id) {
        catalogTableService.delete(id);
    }
}
