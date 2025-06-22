package com.aldous_roy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/software-engineer")
public class SoftwareEngineerController {
    private final SoftwareEngineerService softwareEngineerService;

    @Autowired
    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<SoftwareEngineer> getAllEngineers() {
        return softwareEngineerService.getSoftwareEngineer();
    }
    @GetMapping("/{id}")
    public SoftwareEngineer getEngineerById(@PathVariable Integer id) {
        return softwareEngineerService.getSoftwareEngineerById(id);
    }
    @PostMapping
    public SoftwareEngineer addEngineer(@RequestBody SoftwareEngineer engineer) {
        return softwareEngineerService.addSoftwareEngineer(engineer);
    }
}
