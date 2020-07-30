package com.challenge.service.interfaces;

import com.challenge.entity.Company;
import com.challenge.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserServiceInterface extends ServiceInterface<User> {

    List<User> findAll();

    Optional<User> findById(Long userId);

    List<User> findByAccelerationName(String name);

    List<User> findByCompanyId(Long companyId);

    User save(User user);


}
