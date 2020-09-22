package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Company_unit;
import kz.aitu.advancedJava.service.Company_unitService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Company_unitController {
    private final Company_unitService companyUnitService;

    public Company_unitController(Company_unitService companyUnitService) {
        this.companyUnitService = companyUnitService;
    }

    @GetMapping("/api/Company_unit")
    public ResponseEntity<?> getCompany_unit(){
        return ResponseEntity.ok(companyUnitService.getAll());
    }

    @GetMapping("/api/Company_unit/{id}")
    public ResponseEntity<?> getCompany_unit(@PathVariable Long id){
        return ResponseEntity.ok(companyUnitService.getById(id));
    }

    @PostMapping("/api/Company_unit")
    public ResponseEntity<?>  saveCompany_unit(@RequestBody Company_unit company_unit){
        return ResponseEntity.ok(companyUnitService.create(company_unit));
    }

    @PutMapping("/api/Company_unit")
    public ResponseEntity<?> updateCompany_unit(@RequestBody Company_unit company_unit){
        return ResponseEntity.ok(companyUnitService.update(company_unit));
    }

    @DeleteMapping("/api/Company_unit/{id}")
    public void deleteCompany_unit(@PathVariable Long id) {
        companyUnitService.delete(id);
    }
}
