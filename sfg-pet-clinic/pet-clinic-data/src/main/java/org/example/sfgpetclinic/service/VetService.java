package org.example.sfgpetclinic.service;

import org.example.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Create by Kush on 30-03-2021
 */
public interface VetService {

    Vet findById(Long id);

    Vet save(Vet Vet);

    Set<Vet> findAll();
}
