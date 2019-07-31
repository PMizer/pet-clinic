package com.pm.springframework.petclinic.map;

import com.pm.springframework.petclinic.model.Vet;
import com.pm.springframework.petclinic.services.VetService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {
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
        return super.save(Vet);
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
