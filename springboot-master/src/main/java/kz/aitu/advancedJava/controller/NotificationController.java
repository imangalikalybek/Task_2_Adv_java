package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Notification;
import kz.aitu.advancedJava.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/api/Notification")
    public ResponseEntity<?> getNotification(){
        return ResponseEntity.ok(notificationService.getAll());
    }

    @GetMapping("/api/Notification/{id}")
    public ResponseEntity<?> getNotification(@PathVariable Long id){
        return ResponseEntity.ok(notificationService.getById(id));
    }

    @PostMapping("/api/Notification")
    public ResponseEntity<?>  saveNotification(@RequestBody Notification notification){
        return ResponseEntity.ok(notificationService.create(notification));
    }

    @PutMapping("/api/Notification")
    public ResponseEntity<?> updateNotification(@RequestBody Notification notification){
        return ResponseEntity.ok(notificationService.update(notification));
    }

    @DeleteMapping("/api/Notification/{id}")
    public void deleteNotification(@PathVariable Long id) {
        notificationService.delete(id);
    }
}
