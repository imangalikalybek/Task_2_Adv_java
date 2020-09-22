package kz.aitu.advancedJava.repository;

import kz.aitu.advancedJava.model.Notification;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends CrudRepository<Notification,Long> {
}
