package org.example.sfgpetclinic.bootstrap;

import org.example.sfgpetclinic.model.*;
import org.example.sfgpetclinic.service.OwnerService;
import org.example.sfgpetclinic.service.PetTypeService;
import org.example.sfgpetclinic.service.SpecialityService;
import org.example.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * Create by Kush on 31-03-2021
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count = petTypeService.findAll().size();
        if (count == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");
        PetType petTypeDog = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType petTypeCat = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("A1");
        owner1.setLastName("A2");
        owner1.setAddress("123/1, Street 1, Place 1");
        owner1.setCity("City 1");
        owner1.setTelephone("1234567890");

        Pet petA = new Pet();
        petA.setPetType(petTypeDog);
        petA.setOwner(owner1);
        petA.setBirthDate(LocalDate.now());
        petA.setName("DogA");

        Speciality radiology = new Speciality();
        radiology.setDescription("Radiology");
        Speciality radiologySave = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("Surgery");
        Speciality surgerySave = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        dentistry.setDescription("Dentistry");
        Speciality dentistrySave = specialityService.save(dentistry);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("B1");
        owner2.setLastName("B2");
        owner1.setAddress("456/2, Street 2, Place 2");
        owner2.setCity("City 2");
        owner1.setTelephone("1234567891");

        Pet petB = new Pet();
        petB.setPetType(petTypeCat);
        petB.setOwner(owner2);
        petB.setBirthDate(LocalDate.now());
        petB.setName("CatB");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setFirstName("AA1");
        vet1.setLastName("AA2");
        vet1.getSpecialities().add(radiologySave);

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("BB1");
        vet2.setLastName("BB2");
        vet2.getSpecialities().add(dentistrySave);

        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
