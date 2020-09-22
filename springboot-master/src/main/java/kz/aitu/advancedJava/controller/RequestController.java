package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Request;
import kz.aitu.advancedJava.service.RequestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class RequestController {
    private final RequestService requestService;

    public RequestController(RequestService requestService) {
        this.requestService = requestService;
    }

    @GetMapping("/api/Request")
    public ResponseEntity<?> getRequest(){
        return ResponseEntity.ok(requestService.getAll());
    }

    @GetMapping("/api/Request/{id}")
    public ResponseEntity<?> getRequest(@PathVariable Long id){
        return ResponseEntity.ok(requestService.getById(id));
    }

    @PostMapping("/api/Request")
    public ResponseEntity<?>  saveRequest(@RequestBody Request request){
        return ResponseEntity.ok(requestService.create(request));
    }

    @PutMapping("/api/Request")
    public ResponseEntity<?> updateRequest(@RequestBody Request request){
        return ResponseEntity.ok(requestService.update(request));
    }

    @DeleteMapping("/api/Request/{id}")
    public void deleteRequest(@PathVariable Long id) {
        requestService.delete(id);
    }
}
