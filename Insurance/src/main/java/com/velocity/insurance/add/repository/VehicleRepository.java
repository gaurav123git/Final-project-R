package com.velocity.insurance.add.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.insurance.add.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Integer> {

}
