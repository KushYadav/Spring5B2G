package org.example.sfgpetclinic.service;

import org.example.sfgpetclinic.model.Pet;

import java.util.Set;

/**
 * Create by Kush on 30-03-2021
 */
public interface PetService {

    Pet findById(Long id);

    Pet save(Pet Pet);

    Set<Pet> findAll();
}
