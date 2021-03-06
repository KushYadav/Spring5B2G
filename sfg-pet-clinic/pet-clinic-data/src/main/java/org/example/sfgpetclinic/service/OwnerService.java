package org.example.sfgpetclinic.service;

import org.example.sfgpetclinic.model.Owner;
import org.springframework.stereotype.Service;

/**
 * Create by Kush on 30-03-2021
 */
public interface OwnerService extends CrudService<Owner,Long> {

    Owner findByLastName(String lastName);
}
