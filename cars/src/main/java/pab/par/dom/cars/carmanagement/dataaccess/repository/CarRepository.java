package pab.par.dom.cars.carmanagement.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pab.par.dom.cars.carmanagement.dataaccess.entity.Car;

/**
 * Repository for Car entity
 *
 */
public interface CarRepository extends JpaRepository<Car, Integer> {

}
