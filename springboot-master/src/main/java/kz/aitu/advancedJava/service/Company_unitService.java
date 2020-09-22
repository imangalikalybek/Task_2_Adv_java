package kz.aitu.advancedJava.service;

import kz.aitu.advancedJava.model.Company_unit;
import kz.aitu.advancedJava.repository.Company_unitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Company_unitService {
    public final Company_unitRepository companyUnitRepository;

    public Company_unitService(Company_unitRepository companyUnitRepository) {
        this.companyUnitRepository = companyUnitRepository;
    }


    public List<Company_unit> getAll() {
        return (List<Company_unit>) companyUnitRepository.findAll();
    }

    public Company_unit getById(Long id) {
        return companyUnitRepository.findById(id).orElse(null);
    }

    public Company_unit create(Company_unit companyUnit) {
        return companyUnitRepository.save(companyUnit);
    }

    public Company_unit update(Company_unit companyUnit) {
        return companyUnitRepository.save(companyUnit);
    }

    public void delete(Long id) {
        companyUnitRepository.deleteById(id);
    }
}
