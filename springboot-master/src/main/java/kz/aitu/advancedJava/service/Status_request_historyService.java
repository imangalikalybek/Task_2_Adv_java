package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Status_request_history;
import kz.aitu.advancedJava.repository.Status_request_historyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Status_request_historyService {
    public final Status_request_historyRepository statusRequestHistoryRepository;

    public Status_request_historyService(Status_request_historyRepository statusRequestHistoryRepository) {
        this.statusRequestHistoryRepository = statusRequestHistoryRepository;
    }
    public List<Status_request_history> getAll() {
        return (List<Status_request_history>) statusRequestHistoryRepository.findAll();
    }

    public Status_request_history getById(Long id) {
        return statusRequestHistoryRepository.findById(id).orElse(null);
    }

    public Status_request_history create(Status_request_history statusRequestHistory) {
        return statusRequestHistoryRepository.save(statusRequestHistory);
    }

    public Status_request_history update(Status_request_history statusRequestHistory) {
        return statusRequestHistoryRepository.save(statusRequestHistory);
    }

    public void delete(Long id) {
        statusRequestHistoryRepository.deleteById(id);
    }
}
