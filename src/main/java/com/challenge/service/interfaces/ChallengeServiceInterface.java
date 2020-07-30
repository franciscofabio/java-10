package com.challenge.service.interfaces;

import com.challenge.entity.Challenge;

import java.util.List;

public interface ChallengeServiceInterface extends ServiceInterface<Challenge> {

    List<Challenge> findAll();

    List<Challenge> findByAccelerationIdAndUserId(Long accelerationId, Long userId);

    Challenge save(Challenge challenge);

}
