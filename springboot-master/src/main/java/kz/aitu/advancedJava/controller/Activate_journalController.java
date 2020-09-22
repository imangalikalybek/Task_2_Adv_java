package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Activate_journal;
import kz.aitu.advancedJava.service.Activate_jurnalService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Activate_journalController {

    private final Activate_jurnalService activate_jurnalService;


    public Activate_journalController(Activate_jurnalService activate_jurnalService) {
        this.activate_jurnalService = activate_jurnalService;
    }
    @GetMapping("/api/activateJournal/{id}")
    public ResponseEntity<?> getActivate_journal(@PathVariable Long id) {
        return ResponseEntity.ok(activate_jurnalService.getById(id));
    }

    @GetMapping("/api/activateJournal")
    public ResponseEntity<?> getActivate_journal() {
        return ResponseEntity.ok(activate_jurnalService.getAll());
    }

    @PostMapping("/api/activateJournal")
    public ResponseEntity<?> saveActivate_journal(@RequestBody Activate_journal activate_journal) {
        return ResponseEntity.ok(activate_jurnalService.create(activate_journal));
    }

    @PutMapping("/api/activateJournal")
    public ResponseEntity<?> updateActivate_journal(@RequestBody Activate_journal activate_journal) {
        return ResponseEntity.ok(activate_jurnalService.create(activate_journal));
    }

    @DeleteMapping("/api/activateJournal/{id}")
    public void deleteActivate_journal(@PathVariable Long id) {
        activate_jurnalService.delete(id);
    }

}
