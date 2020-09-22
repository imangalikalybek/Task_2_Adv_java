package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Auth;
import kz.aitu.advancedJava.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {
    private final AuthService authService;

    public AuthController(kz.aitu.advancedJava.service.AuthService authService) {
        this.authService = authService;
    }

    @GetMapping("/api/auth")
    public ResponseEntity<?> getAuth(){
        return ResponseEntity.ok(authService.getAll());
    }

    @GetMapping("/api/auth/{id}")
    public ResponseEntity<?> getAuth(@PathVariable Long id){
        return ResponseEntity.ok(authService.getById(id));
    }

    @PostMapping("/api/auth")
    public ResponseEntity<?>  saveAuth(@RequestBody Auth auth){
        return ResponseEntity.ok(authService.create(auth));
    }

    @PutMapping("/api/auth")
    public ResponseEntity<?> updateAuth(@RequestBody Auth auth){
        return ResponseEntity.ok(authService.update(auth));
    }

    @DeleteMapping("/api/auth/{id}")
    public void deleteAuth(@PathVariable Long id) {
        authService.delete(id);
    }
}
