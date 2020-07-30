package com.challenge.service;

import com.challenge.entity.Company;
import com.challenge.entity.User;
import com.challenge.repository.UserRepository;
import com.challenge.service.interfaces.UserServiceInterface;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserServiceInterface {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<User> findById(Long userId) {
        return this.userRepository.findById(userId);
    }

    @Override
    public List<User> findByAccelerationName(String name) {
        return this.userRepository.findByAccelerationName(name);
    }

    @Override
    public List<User> findByCompanyId(Long companyId) {
        return this.userRepository.findByCompanyId(companyId);
    }

    @Override
    public User save(User user) {
        return this.userRepository.save(user);
    }
}
