package org.example.sfgpetclinic.service.map;

import org.example.sfgpetclinic.model.Owner;
import org.example.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Create by Kush on 31-03-2021
 */
@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
