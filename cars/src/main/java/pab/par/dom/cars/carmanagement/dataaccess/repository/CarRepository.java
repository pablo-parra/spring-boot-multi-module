package pab.par.dom.cars.carmanagement.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pab.par.dom.cars.carmanagement.dataaccess.entity.Car;

/**
 * Repository for Car entity
 *
 */
public interface CarRepository extends JpaRepository<Car, Integer> {

  /**
   * @param plate the car plate
   * @return the car with the given plate
   */
  @Query("SELECT c FROM Car c WHERE c.plate = :plate")
  Car findByPlate(@Param("plate") String plate);

}
