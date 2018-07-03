package pab.par.dom.drivers.logic.management.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pab.par.dom.drivers.dataaccess.entity.Driver;
import pab.par.dom.drivers.dataaccess.repository.DriverRepository;
import pab.par.dom.drivers.logic.dto.DriverDTO;
import pab.par.dom.drivers.logic.management.Drivermanagement;

/**
 * Implementation for Drivermanagement interface
 *
 */
@Service
@Transactional
public class DrivermanagementImpl implements Drivermanagement {

  @Autowired
  private DriverRepository driverRepository;

  @Override
  public List<DriverDTO> getAllDrivers() {

    return toDriverDtoList(this.driverRepository.findAll());
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
