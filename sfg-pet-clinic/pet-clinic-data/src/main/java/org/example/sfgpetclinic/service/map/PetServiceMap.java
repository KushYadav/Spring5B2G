package org.example.sfgpetclinic.service.map;

import org.example.sfgpetclinic.model.Pet;
import org.example.sfgpetclinic.service.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Create by Kush on 31-03-2021
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet Pet) {
        return super.save(Pet.getId(),Pet);
    }

    @Override
    public void delete(Pet Pet) {
        super.delete(Pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
