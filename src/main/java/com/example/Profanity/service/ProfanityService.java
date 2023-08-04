package com.example.Profanity.service;

import com.example.Profanity.entity.Profanity;

import java.util.List;

public interface ProfanityService {
    Profanity addProfanity(Profanity profanity);

    List<Profanity> getProfanities();

    Profanity updateProfanity(Long id , Profanity profanity);

    void deleteProfanityById(Long id);
}
