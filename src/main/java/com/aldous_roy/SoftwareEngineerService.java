package com.aldous_roy;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SoftwareEngineerService {

    private SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getSoftwareEngineer() {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer addSoftwareEngineer(SoftwareEngineer engineer) {
        if(engineer.getName() == null || engineer.getTechStack() == null) {
            throw new IllegalArgumentException("Name and Tech Stack cannot be null");
        }
        return softwareEngineerRepository.save(engineer);
    }
}