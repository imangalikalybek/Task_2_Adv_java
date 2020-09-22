package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.File;
import kz.aitu.advancedJava.service.FileService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class FileController {
    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @GetMapping("/api/File")
    public ResponseEntity<?> getFile(){
        return ResponseEntity.ok(fileService.getAll());
    }

    @GetMapping("/api/File/{id}")
    public ResponseEntity<?> getFile(@PathVariable Long id){
        return ResponseEntity.ok(fileService.getById(id));
    }

    @PostMapping("/api/File")
    public ResponseEntity<?>  saveFile(@RequestBody File file){
        return ResponseEntity.ok(fileService.create(file));
    }

    @PutMapping("/api/File")
    public ResponseEntity<?> updateFile(@RequestBody File file){
        return ResponseEntity.ok(fileService.update(file));
    }

    @DeleteMapping("/api/File/{id}")
    public void deleteFile(@PathVariable Long id) {
        fileService.delete(id);
    }
}
