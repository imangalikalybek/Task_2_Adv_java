package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Record;
import kz.aitu.advancedJava.service.RecordService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ReocrdController {
    private final RecordService recordService;

    public ReocrdController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping("/api/Record")
    public ResponseEntity<?> getRecord(){
        return ResponseEntity.ok(recordService.getAll());
    }

    @GetMapping("/api/Record/{id}")
    public ResponseEntity<?> getRecord(@PathVariable Long id){
        return ResponseEntity.ok(recordService.getById(id));
    }

    @PostMapping("/api/Record")
    public ResponseEntity<?>  saveRecord(@RequestBody Record record){
        return ResponseEntity.ok(recordService.create(record));
    }

    @PutMapping("/api/Record")
    public ResponseEntity<?> updateRecord(@RequestBody Record record){
        return ResponseEntity.ok(recordService.update(record));
    }

    @DeleteMapping("/api/Record/{id}")
    public void deleteRecord(@PathVariable Long id) {
        recordService.delete(id);
    }
}
