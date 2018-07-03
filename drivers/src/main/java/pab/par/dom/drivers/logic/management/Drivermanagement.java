package pab.par.dom.drivers.logic.management;

import java.util.List;

import pab.par.dom.drivers.logic.dto.DriverDTO;

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
