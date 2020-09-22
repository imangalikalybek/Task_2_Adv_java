package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Share;
import kz.aitu.advancedJava.service.ShareService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShareController {
    private final ShareService shareService;

    public ShareController(ShareService shareService) {
        this.shareService = shareService;
    }

    @GetMapping("/api/Share")
    public ResponseEntity<?> getShare(){
        return ResponseEntity.ok(shareService.getAll());
    }

    @GetMapping("/api/Share/{id}")
    public ResponseEntity<?> getShare(@PathVariable Long id){
        return ResponseEntity.ok(shareService.getById(id));
    }

    @PostMapping("/api/Share")
    public ResponseEntity<?>  saveShare(@RequestBody Share share){
        return ResponseEntity.ok(shareService.create(share));
    }

    @PutMapping("/api/Share")
    public ResponseEntity<?> updateShare(@RequestBody Share share){
        return ResponseEntity.ok(shareService.update(share));
    }

    @DeleteMapping("/api/Share/{id}")
    public void deleteShare(@PathVariable Long id) {
        shareService.delete(id);
    }
}
