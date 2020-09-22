package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Users;
import kz.aitu.advancedJava.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {
    public final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getAll() {
        return (List<Users>) usersRepository.findAll();
    }

    public Users getById(Long id) {
        return usersRepository.findById(id).orElse(null);
    }

    public Users create(Users users) {
        return usersRepository.save(users);
    }

    public Users update(Users users) {
        return usersRepository.save(users);
    }

    public void delete(Long id) {
        usersRepository.deleteById(id);
    }
}
