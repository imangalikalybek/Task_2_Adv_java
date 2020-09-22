package kz.aitu.advancedJava.controller;

import kz.aitu.advancedJava.model.Location;
import kz.aitu.advancedJava.service.LocationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LocationController {
    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("/api/Location")
    public ResponseEntity<?> getLocation(){
        return ResponseEntity.ok(locationService.getAll());
    }

    @GetMapping("/api/Location/{id}")
    public ResponseEntity<?> getLocation(@PathVariable Long id){
        return ResponseEntity.ok(locationService.getById(id));
    }

    @PostMapping("/api/Location")
    public ResponseEntity<?>  saveLocation(@RequestBody Location location){
        return ResponseEntity.ok(locationService.create(location));
    }

    @PutMapping("/api/Location")
    public ResponseEntity<?> updateLocation(@RequestBody Location location){
        return ResponseEntity.ok(locationService.update(location));
    }

    @DeleteMapping("/api/Location/{id}")
    public void deleteLocation(@PathVariable Long id) {
        locationService.delete(id);
    }
}
