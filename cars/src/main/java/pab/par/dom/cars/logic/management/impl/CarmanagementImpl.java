package pab.par.dom.cars.logic.management.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pab.par.dom.cars.dataaccess.entity.Car;
import pab.par.dom.cars.dataaccess.repository.CarRepository;
import pab.par.dom.cars.logic.dto.CarDTO;
import pab.par.dom.cars.logic.management.Carmanagement;

/**
 * Implementation for {@link Carmanagement}
 *
 */
@Service
@Transactional
public class CarmanagementImpl implements Carmanagement {

  @Autowired
  private CarRepository carRepository;

  @Override
  public List<CarDTO> getCars() {

    return toCarDtoList(this.carRepository.findAll());
  }

  // This is only for example purposes. Implement your preferred mapping solution
  private List<CarDTO> toCarDtoList(List<Car> drivers) {

    List<CarDTO> dtoList = new ArrayList<>();
    drivers.forEach(d -> dtoList.add(toCarDto(d)));
    return dtoList;
  }

  private CarDTO toCarDto(Car car) {

    CarDTO dto = new CarDTO();

    if (null != car) {

      if (null != car.getId())
        dto.setId(car.getId());

      String plate = car.getPlate();
      if (null != plate)
        dto.setPlate(plate);

      String model = car.getModel();
      if (null != model)
        dto.setModel(model);

      String brand = car.getBrand();
      if (null != brand)
        dto.setBrand(brand);
    }

    return dto;
  }

}
