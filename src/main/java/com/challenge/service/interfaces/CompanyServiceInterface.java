package com.challenge.service.interfaces;

import com.challenge.entity.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyServiceInterface extends ServiceInterface<Company> {

    List<Company> findAll();

    Optional<Company> findById(Long id);

    List<Company> findByAccelerationId(Long accelerationId);

    List<Company> findByUserId(Long userId);

    Company save(Company company);

}
