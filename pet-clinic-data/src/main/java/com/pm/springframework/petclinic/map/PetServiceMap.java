package com.pm.springframework.petclinic.map;

import com.pm.springframework.petclinic.model.Pet;
import com.pm.springframework.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet Pet) {
        return super.save(Pet);
    }

    @Override
    public void delete(Pet Pet) {
        super.delete(Pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
