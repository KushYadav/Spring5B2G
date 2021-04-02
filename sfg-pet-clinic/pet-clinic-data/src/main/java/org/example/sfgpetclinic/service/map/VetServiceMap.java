package org.example.sfgpetclinic.service.map;

import org.example.sfgpetclinic.model.Speciality;
import org.example.sfgpetclinic.model.Vet;
import org.example.sfgpetclinic.service.SpecialityService;
import org.example.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Create by Kush on 31-03-2021
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet vet) {

        if (vet.getSpecialities().size() > 0) {
            vet.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null) {
                    Speciality savedSpeciality = specialityService.save(speciality);
                    speciality.setId(savedSpeciality.getId());
                }
            });
        }
        return super.save(vet);
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
