package pab.par.dom.drivers.drivermanagement.logic.dto;

import pab.par.dom.cars.carmanagement.logic.dto.CarDTO;

/**
 * Data Transfer Object for the DriverWithCar service
 *
 */
public class DriverWithCarDTO {

  private DriverDTO driverDto;

  private CarDTO carDto;

  /**
   * @return driverDto
   */
  public DriverDTO getDriverDto() {

    return this.driverDto;
  }

  /**
   * @param driverDto new value of {@link #getDriverDto}.
   */
  public void setDriverDto(DriverDTO driverDto) {

    this.driverDto = driverDto;
  }

  /**
   * @return carDto
   */
  public CarDTO getCarDto() {

    return this.carDto;
  }

  /**
   * @param carDto new value of {@link #getCarDto}.
   */
  public void setCarDto(CarDTO carDto) {

    this.carDto = carDto;
  }

}
