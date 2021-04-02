package org.example.sfgpetclinic.bootstrap;

import org.example.sfgpetclinic.model.Owner;
import org.example.sfgpetclinic.model.Pet;
import org.example.sfgpetclinic.model.PetType;
import org.example.sfgpetclinic.model.Vet;
import org.example.sfgpetclinic.service.OwnerService;
import org.example.sfgpetclinic.service.PetTypeService;
import org.example.sfgpetclinic.service.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.cglib.core.Local;
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

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

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

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("BB1");
        vet2.setLastName("BB2");

        vetService.save(vet2);

        System.out.println("Loaded vets");
    }
}
