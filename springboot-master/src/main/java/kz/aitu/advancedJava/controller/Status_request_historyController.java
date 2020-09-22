package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Status_request_history;
import kz.aitu.advancedJava.service.Status_request_historyService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Status_request_historyController {
    private final Status_request_historyService status_request_historyService;

    public Status_request_historyController(Status_request_historyService status_request_historyService) {
        this.status_request_historyService = status_request_historyService;
    }

    @GetMapping("/api/Status_request_history")
    public ResponseEntity<?> getStatus_request_history(){
        return ResponseEntity.ok(status_request_historyService.getAll());
    }

    @GetMapping("/api/Status_request_history/{id}")
    public ResponseEntity<?> getStatus_request_history(@PathVariable Long id){
        return ResponseEntity.ok(status_request_historyService.getById(id));
    }

    @PostMapping("/api/Status_request_history")
    public ResponseEntity<?>  saveStatus_request_history(@RequestBody Status_request_history statusRequestHistory){
        return ResponseEntity.ok(status_request_historyService.create(statusRequestHistory));
    }

    @PutMapping("/api/Status_request_history")
    public ResponseEntity<?> updateStatus_request_history(@RequestBody Status_request_history statusRequestHistory){
        return ResponseEntity.ok(status_request_historyService.update(statusRequestHistory));
    }

    @DeleteMapping("/api/Status_request_history/{id}")
    public void deleteStatus_request_history(@PathVariable Long id) {
        status_request_historyService.delete(id);
    }
}
