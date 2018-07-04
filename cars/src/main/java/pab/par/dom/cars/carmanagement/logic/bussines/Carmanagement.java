package pab.par.dom.cars.carmanagement.logic.bussines;

import java.util.List;

import pab.par.dom.cars.carmanagement.logic.dto.CarDTO;

/**
 * Interface for Car management logic
 *
 */
public interface Carmanagement {

  List<CarDTO> getCars();
}
