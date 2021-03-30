package org.example.sfgpetclinic.service;

import org.example.sfgpetclinic.model.Owner;

import java.util.Set;

/**
 * Create by Kush on 30-03-2021
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
