package org.example.sgfpetclinic.bootstrap;

import org.example.sfgpetclinic.model.Owner;
import org.example.sfgpetclinic.model.Vet;
import org.example.sfgpetclinic.service.OwnerService;
import org.example.sfgpetclinic.service.OwnerServiceMap;
import org.example.sfgpetclinic.service.VetService;
import org.example.sfgpetclinic.service.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.reactive.filter.OrderedWebFilter;
import org.springframework.stereotype.Component;

/**
 * Create by Kush on 31-03-2021
 */
@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(){
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("A1");
        owner1.setLastName("A2");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("B1");
        owner2.setLastName("B2");

        ownerService.save(owner2);

        System.out.println("Loaded Owners");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("AA1");
        vet1.setLastName("AA2");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("BB1");
        vet2.setLastName("BB2");

        vetService.save(vet2);

        System.out.println("Loaded vets");


    }
}
