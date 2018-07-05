package pab.par.dom.drivers.drivermanagement.logic.bussines.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pab.par.dom.cars.carmanagement.logic.bussines.Carmanagement;
import pab.par.dom.drivers.drivermanagement.dataaccess.entity.Driver;
import pab.par.dom.drivers.drivermanagement.dataaccess.repository.DriverRepository;
import pab.par.dom.drivers.drivermanagement.logic.bussines.Drivermanagement;
import pab.par.dom.drivers.drivermanagement.logic.dto.DriverDTO;
import pab.par.dom.drivers.drivermanagement.logic.dto.DriverWithCarDTO;

/**
 * Implementation for Drivermanagement interface
 *
 */
@Service
@Transactional
public class DrivermanagementImpl implements Drivermanagement {

  @Autowired
  private DriverRepository driverRepository;

  @Autowired
  private Carmanagement carManagement;

  @Override
  public List<DriverDTO> getAllDrivers() {

    return toDriverDtoList(this.driverRepository.findAll());
  }

  @Override
  public DriverWithCarDTO getDriverWithCarData(Integer id) {

    DriverWithCarDTO driverWithCarDto = new DriverWithCarDTO();
    Optional<Driver> driver = this.driverRepository.findById(id);
    if (driver.isPresent()) {
      driverWithCarDto.setDriverDto(toDriverDto(driver.get()));
      driverWithCarDto.setCarDto(this.carManagement.getCarByPlate(driver.get().getCarPlate()));
    }
    return driverWithCarDto;
  }

  // This is only for example purposes. Implement your preferred mapping solution
  private List<DriverDTO> toDriverDtoList(List<Driver> drivers) {

    List<DriverDTO> dtoList = new ArrayList<>();
    drivers.forEach(d -> dtoList.add(toDriverDto(d)));
    return dtoList;
  }

  private DriverDTO toDriverDto(Driver driver) {

    DriverDTO dto = new DriverDTO();

    dto.setId(driver.getId());
    dto.setName(driver.getName());
    dto.setLastName(driver.getLastName());
    dto.setCarPlate(driver.getCarPlate());

    return dto;
  }

}
