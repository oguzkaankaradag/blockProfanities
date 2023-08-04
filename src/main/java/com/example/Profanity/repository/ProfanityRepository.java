package com.example.Profanity.repository;

import com.example.Profanity.entity.Profanity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfanityRepository extends JpaRepository<Profanity,Long> {
}
