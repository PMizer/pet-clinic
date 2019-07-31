package com.pm.springframework.petclinic.services;

import com.pm.springframework.petclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
