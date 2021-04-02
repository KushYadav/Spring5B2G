package org.example.sfgpetclinic.service.map;

import org.example.sfgpetclinic.model.Speciality;
import org.example.sfgpetclinic.service.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Create by Kush on 02-04-2021
 */
@Service
public class SpecialityMapService extends AbstractMapService<Speciality, Long> implements SpecialityService {


    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public Speciality save(Speciality speciality) {
        return super.save(speciality);
    }

    @Override
    public Speciality findById(Long id) {
        return super.findById(id);
    }
}
