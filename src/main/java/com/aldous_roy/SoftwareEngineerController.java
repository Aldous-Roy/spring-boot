package com.aldous_roy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/software-engineer")
public class SoftwareEngineerController {
    @GetMapping
    public List<SoftwareEngineer> getSoftwareEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Roy",
                        "reactJS"
                ),
                new SoftwareEngineer(
                        2,
                        "charan",
                        "java Spring Boot"
                )
        );
    }
}
