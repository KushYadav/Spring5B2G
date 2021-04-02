package org.example.sfgpetclinic.model;

import java.util.Set;

/**
 * Create by Kush on 30-03-2021
 */
public class Vet extends Person{

    private Set<Speciality> specialities;

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}
