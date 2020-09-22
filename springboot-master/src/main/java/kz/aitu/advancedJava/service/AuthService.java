package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Auth;
import kz.aitu.advancedJava.repository.AuthRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthService {
    public final AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

    public List<Auth> getAll() {
        return (List<Auth>) authRepository.findAll();
    }

    public Auth getById(Long id) {
        return authRepository.findById(id).orElse(null);
    }

    public Auth create(Auth auth) {
        return authRepository.save(auth);
    }

    public Auth update(Auth auth) {
        return authRepository.save(auth);
    }

    public void delete(Long id) {
        authRepository.deleteById(id);
    }

}
