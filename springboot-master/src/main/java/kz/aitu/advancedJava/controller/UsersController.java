package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Users;
import kz.aitu.advancedJava.service.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/api/Users")
    public ResponseEntity<?> getUsers(){
        return ResponseEntity.ok(usersService.getAll());
    }

    @GetMapping("/api/Users/{id}")
    public ResponseEntity<?> getUsers(@PathVariable Long id){
        return ResponseEntity.ok(usersService.getById(id));
    }

    @PostMapping("/api/Users")
    public ResponseEntity<?>  saveUsers(@RequestBody Users users){
        return ResponseEntity.ok(usersService.create(users));
    }

    @PutMapping("/api/Users")
    public ResponseEntity<?> updateUsers(@RequestBody Users users){
        return ResponseEntity.ok(usersService.update(users));
    }

    @DeleteMapping("/api/Users/{id}")
    public void deleteUsers(@PathVariable Long id) {
        usersService.delete(id);
    }
}
