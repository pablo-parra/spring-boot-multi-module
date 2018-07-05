package pab.par.dom.cars.carsmanagement;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pab.par.dom.cars.carmanagement.dataaccess.entity.Car;
import pab.par.dom.cars.carmanagement.dataaccess.repository.CarRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CarsmanagementImplTests {

  @Autowired
  private CarRepository carRepository;

  @Test
  public void getCarTest() {

    List<Car> cars = this.carRepository.findAll();
    assertThat(cars.size()).isEqualTo(3);
  }

}
