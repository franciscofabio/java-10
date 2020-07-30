package com.challenge.controller;

import com.challenge.entity.Acceleration;
import com.challenge.service.interfaces.AccelerationServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/acceleration")
public class AccelerationController {

    @Autowired
    private AccelerationServiceInterface accelerationService;

    @GetMapping
    public Iterable<Acceleration> findAll() {
        return this.accelerationService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Acceleration> findById(@PathVariable("id") Long id) {
        return this.accelerationService.findById(id);
    }

    @GetMapping("/findByName/{name}")
    public Optional<Acceleration> findByName(@PathVariable("name") String name) {
        return this.accelerationService.findByName(name);
    }

    @GetMapping("/findByCompanyId/{id}")
    public List<Acceleration> findByCompanyId(@PathVariable("id") Long companyId) {
        return this.accelerationService.findByCompanyId(companyId);
    }

    @PostMapping
    public Acceleration save(@RequestBody Acceleration acceleration) {
        return this.accelerationService.save(acceleration);
    }
}
