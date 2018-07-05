package pab.par.dom.drivers.drivermanagement.logic.bussines;

import java.util.List;

import pab.par.dom.drivers.drivermanagement.logic.dto.DriverDTO;
import pab.par.dom.drivers.drivermanagement.logic.dto.DriverWithCarDTO;

/**
 * Interface for the logic layer of the driver management
 *
 */
public interface Drivermanagement {

  /**
   * @return a list with all drivers
   */
  List<DriverDTO> getAllDrivers();

  /**
   * @param id the identifier of the driver
   * @return the driver data alongside his car data
   */
  DriverWithCarDTO getDriverWithCarData(Integer id);
}
