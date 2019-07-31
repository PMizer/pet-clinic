package com.pm.springframework.petclinic.bootstrap;

import com.pm.springframework.petclinic.map.OwnerServiceMap;
import com.pm.springframework.petclinic.map.VetServiceMap;
import com.pm.springframework.petclinic.model.Owner;
import com.pm.springframework.petclinic.model.Vet;
import com.pm.springframework.petclinic.services.OwnerService;
import com.pm.springframework.petclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner1.setId(2L);
        owner1.setFirstName("Peter");
        owner1.setLastName("Pan");

        ownerService.save(owner2);

        System.out.println("Loading Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Randomius");
        vet1.setLastName("Nameus");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet1.setId(2L);
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet2);

        System.out.println("Loading Vets...");
    }
}
