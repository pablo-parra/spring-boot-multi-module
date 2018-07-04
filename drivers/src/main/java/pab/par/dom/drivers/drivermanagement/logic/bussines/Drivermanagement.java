package pab.par.dom.drivers.drivermanagement.logic.bussines;

import java.util.List;

import pab.par.dom.drivers.drivermanagement.logic.dto.DriverDTO;

/**
 * Interface for the logic layer of the driver management
 *
 */
public interface Drivermanagement {

  /**
   * @return a list with all drivers
   */
  List<DriverDTO> getAllDrivers();
}
