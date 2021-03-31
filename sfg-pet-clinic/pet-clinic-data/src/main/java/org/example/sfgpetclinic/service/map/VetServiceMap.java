package org.example.sfgpetclinic.service.map;

import org.example.sfgpetclinic.model.Vet;
import org.example.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Create by Kush on 31-03-2021
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet Vet) {
        return super.save(Vet);
    }

    @Override
    public void delete(Vet Vet) {
        super.delete(Vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
