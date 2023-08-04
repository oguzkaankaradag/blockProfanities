package com.example.Profanity.service.serviceImpl;

import com.example.Profanity.entity.Profanity;
import com.example.Profanity.exception.ResourceNotFoundException;
import com.example.Profanity.repository.ProfanityRepository;
import com.example.Profanity.service.ProfanityService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@Getter
@Setter
public class ProfanityServiceImpl implements ProfanityService {
    ProfanityRepository profanityRepository;

    @Override
    public Profanity addProfanity(Profanity profanity) {

        Profanity savedProfanity = profanityRepository.save(profanity);
        return savedProfanity;
    }

    @Override
    public List<Profanity> getProfanities() {

        List<Profanity> profanities = profanityRepository.findAll();
        return profanities;
    }

    @Override
    public Profanity updateProfanity(Long id, Profanity profanity) {

        Profanity savedProfanity = profanityRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Profanity not exist with id" + id));

        Profanity upProfanity = new Profanity(
                savedProfanity.getId(),
                profanity.getValue(),
                profanity.getReason(),
                profanity.getLang()
        );

        Profanity updatedProfanity = profanityRepository.save(upProfanity);
        return updatedProfanity;
    }

    @Override
    public void deleteProfanityById(Long id) {
        profanityRepository.deleteById(id);
    }

}
