package com.example.petsdi.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Create by Kush on 28-03-2021
 */

@Profile("Cat")
@Service
public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats";
    }
}
