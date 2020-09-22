package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Case_index;
import kz.aitu.advancedJava.service.Case_indexService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Case_indexController {
    private final Case_indexService caseIndexService;


    public Case_indexController(Case_indexService caseIndexService) {
        this.caseIndexService = caseIndexService;
    }

    @GetMapping("/api/case_index")
    public ResponseEntity<?> getCase_index(){
        return ResponseEntity.ok(caseIndexService.getAll());
    }

    @GetMapping("/api/case_index/{id}")
    public ResponseEntity<?> getCase_index(@PathVariable Long id){
        return ResponseEntity.ok(caseIndexService.getById(id));
    }

    @PostMapping("/api/case_index")
    public ResponseEntity<?>  saveCase_index(@RequestBody Case_index caseIndex){
        return ResponseEntity.ok(caseIndexService.create(caseIndex));
    }

    @PutMapping("/api/case_index")
    public ResponseEntity<?> updateCase_index(@RequestBody Case_index caseIndex){
        return ResponseEntity.ok(caseIndexService.update(caseIndex));
    }

    @DeleteMapping("/api/case_index/{id}")
    public void deleteCase_index(@PathVariable Long id) {
        caseIndexService.delete(id);
    }

}
