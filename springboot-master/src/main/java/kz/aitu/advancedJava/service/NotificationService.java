package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Notification;
import kz.aitu.advancedJava.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService {
    public final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public List<Notification> getAll() {
        return (List<Notification>) notificationRepository.findAll();
    }

    public Notification getById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }

    public Notification create(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification update(Notification notification) {
        return notificationRepository.save(notification);
    }

    public void delete(Long id) {
        notificationRepository.deleteById(id);
    }
}
