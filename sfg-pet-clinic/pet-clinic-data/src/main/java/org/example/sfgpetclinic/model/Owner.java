package org.example.sfgpetclinic.model;

import java.util.Set;

/**
 * Create by Kush on 30-03-2021
 */
public class Owner extends Person{

    private Set<Pet> pets;

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}
