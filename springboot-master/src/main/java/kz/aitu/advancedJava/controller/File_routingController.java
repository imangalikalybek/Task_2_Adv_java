package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.File_routing;
import kz.aitu.advancedJava.service.File_routingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class File_routingController {
    private final File_routingService fileRoutingService;

    public File_routingController(File_routingService fileRoutingService) {
        this.fileRoutingService = fileRoutingService;
    }

    @GetMapping("/api/File_routing")
    public ResponseEntity<?> getFile_routing(){
        return ResponseEntity.ok(fileRoutingService.getAll());
    }

    @GetMapping("/api/File_routing/{id}")
    public ResponseEntity<?> getFile_routing(@PathVariable Long id){
        return ResponseEntity.ok(fileRoutingService.getById(id));
    }

    @PostMapping("/api/File_routing")
    public ResponseEntity<?>  saveFile_routing(@RequestBody File_routing fileRouting){
        return ResponseEntity.ok(fileRoutingService.create(fileRouting));
    }

    @PutMapping("/api/File_routing")
    public ResponseEntity<?> updateFile_routing(@RequestBody File_routing fileRouting){
        return ResponseEntity.ok(fileRoutingService.update(fileRouting));
    }

    @DeleteMapping("/api/File_routing/{id}")
    public void deleteFile_routing(@PathVariable Long id) {
        fileRoutingService.delete(id);
    }
}
