package com.example.petsdi.service;

import org.springframework.stereotype.Service;

/**
 * Create by Kush on 31-03-2021
 */
public class PetServiceFactory {
    public PetService getPetService(String petType){
        switch (petType){
            case "dog":
                return new DogPetService();
            case "cat":
                return new CatPetService();
            default:
                return new DogPetService();
        }
    }

}
