package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Company;
import kz.aitu.advancedJava.repository.CompanyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyService {

    public final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public List<Company> getAll() {
        return (List<Company>) companyRepository.findAll();
    }

    public Company getById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    public Company create(Company company) {
        return companyRepository.save(company);
    }

    public Company update(Company company) {
        return companyRepository.save(company);
    }

    public void delete(Long id) {
        companyRepository.deleteById(id);
    }
}
