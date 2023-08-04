package com.example.Profanity.controller;

import com.example.Profanity.entity.Profanity;
import com.example.Profanity.service.ProfanityService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/reserved_names")
@AllArgsConstructor
public class ProfanityController {

    private  ProfanityService profanityService;
    @PostMapping
    public ResponseEntity<Profanity> addProfanity(@RequestBody Profanity profanity){

        Profanity savedProfanity = profanityService.addProfanity(profanity);
        return new ResponseEntity<>(savedProfanity, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Profanity>> getProfanities(){

        List<Profanity> profanities = profanityService.getProfanities();
        return new ResponseEntity<>(profanities,HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profanity> updateProfanity(@PathVariable("id") Long profanityId , @RequestBody Profanity profanity){

        Profanity updatedProfanity = profanityService.updateProfanity(profanityId, profanity);
        return new ResponseEntity<>(updatedProfanity,HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public String deleteProfanityById(@PathVariable("id") Long id){

        profanityService.deleteProfanityById(id);
        return "Profanity deleted successfully !";
    }


}
