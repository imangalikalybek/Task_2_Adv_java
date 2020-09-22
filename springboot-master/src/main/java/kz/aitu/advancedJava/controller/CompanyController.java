package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Company;
import kz.aitu.advancedJava.service.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/api/Company")
    public ResponseEntity<?> getCompany(){
        return ResponseEntity.ok(companyService.getAll());
    }

    @GetMapping("/api/Company/{id}")
    public ResponseEntity<?> getCompany(@PathVariable Long id){
        return ResponseEntity.ok(companyService.getById(id));
    }

    @PostMapping("/api/Company")
    public ResponseEntity<?>  saveCompany(@RequestBody Company company){
        return ResponseEntity.ok(companyService.create(company));
    }

    @PutMapping("/api/Company")
    public ResponseEntity<?> updateCompany(@RequestBody Company company){
        return ResponseEntity.ok(companyService.update(company));
    }

    @DeleteMapping("/api/Company/{id}")
    public void deleteCompany(@PathVariable Long id) {
        companyService.delete(id);
    }
}
