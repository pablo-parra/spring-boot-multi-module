package pab.par.dom.cars.carmanagement.logic.bussines;

import java.util.List;

import pab.par.dom.cars.carmanagement.logic.dto.CarDTO;

/**
 * Interface for Car management logic
 *
 */
public interface Carmanagement {

  /**
   * @return a list of all cars
   */
  List<CarDTO> getCars();

  /**
   * @param plate the car plate to filter
   * @return the car with the given plate
   */
  CarDTO getCarByPlate(String plate);
}
