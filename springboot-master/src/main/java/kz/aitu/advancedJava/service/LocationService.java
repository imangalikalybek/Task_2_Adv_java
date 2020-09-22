package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Location;
import kz.aitu.advancedJava.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationService {
    public final LocationRepository locationRepository;

    public LocationService(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    public List<Location> getAll() {
        return (List<Location>) locationRepository.findAll();
    }

    public Location getById(Long id) {
        return locationRepository.findById(id).orElse(null);
    }

    public Location create(Location location) {
        return locationRepository.save(location);
    }

    public Location update(Location location) {
        return locationRepository.save(location);
    }

    public void delete(Long id) {
        locationRepository.deleteById(id);
    }
}
