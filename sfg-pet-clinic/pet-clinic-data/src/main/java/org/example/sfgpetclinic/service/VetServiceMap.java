package org.example.sfgpetclinic.service;

import org.example.sfgpetclinic.model.Vet;
import org.example.sfgpetclinic.model.Vet;

import java.util.Set;

/**
 * Create by Kush on 31-03-2021
 */
public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet,Long>{

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
        return super.save(Vet.getId(),Vet);
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
