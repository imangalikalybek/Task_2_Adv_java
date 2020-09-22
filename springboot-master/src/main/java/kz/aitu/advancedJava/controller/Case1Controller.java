package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Case1;
import kz.aitu.advancedJava.service.Case1Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Case1Controller {
    private final Case1Service case1Service;

    public Case1Controller(Case1Service case1Service) {
        this.case1Service = case1Service;
    }

    @GetMapping("/api/case1")
    public ResponseEntity<?> getCase1(){
        return ResponseEntity.ok(case1Service.getAll());
    }

    @GetMapping("/api/case1/{id}")
    public ResponseEntity<?> getCase1(@PathVariable Long id){
        return ResponseEntity.ok(case1Service.getById(id));
    }

    @PostMapping("/api/case1")
    public ResponseEntity<?>  saveCase1(@RequestBody Case1 case1){
        return ResponseEntity.ok(case1Service.create(case1));
    }

    @PutMapping("/api/case1")
    public ResponseEntity<?> updateCase1(@RequestBody Case1 case1){
        return ResponseEntity.ok(case1Service.update(case1));
    }

    @DeleteMapping("/api/case1/{id}")
    public void deleteCase1(@PathVariable Long id) {
        case1Service.delete(id);
    }
}
