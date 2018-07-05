package pab.par.dom.drivers.driversmanagement;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import pab.par.dom.drivers.DriversApplication;
import pab.par.dom.drivers.drivermanagement.logic.bussines.Drivermanagement;
import pab.par.dom.drivers.drivermanagement.logic.dto.DriverWithCarDTO;

/**
 * Test class for Driver management logic
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = { DriversApplication.class })
public class DrivermanagementImplTest {

  @Autowired
  private Drivermanagement drivermanagement;

  int driverId;

  String expectedName;

  String expectedLastName;

  String expectedCarPlate;

  String expectedCarBrand;

  String expectedCarModel;

  /**
   * Initialization of resources
   */
  @Before
  public void init() {

    this.driverId = 1;
    this.expectedName = "Elon";
    this.expectedLastName = "Musk";
    this.expectedCarPlate = "1111AAA";
    this.expectedCarBrand = "Tesla";
    this.expectedCarModel = "ModelS";
  }

  /**
   * Checks the process that fills the Driver and Car data
   */
  @Test
  public void getDriverWithCarDataTest() {

    DriverWithCarDTO driverAndcar = this.drivermanagement.getDriverWithCarData(this.driverId);

    assertThat(driverAndcar).isNotNull();

    assertThat(driverAndcar.getDriverDto()).isNotNull();
    assertThat(driverAndcar.getDriverDto().getName()).isEqualTo(this.expectedName);
    assertThat(driverAndcar.getDriverDto().getLastName()).isEqualTo(this.expectedLastName);
    assertThat(driverAndcar.getDriverDto().getCarPlate()).isEqualTo(this.expectedCarPlate);

    assertThat(driverAndcar.getCarDto()).isNotNull();
    assertThat(driverAndcar.getCarDto().getPlate()).isEqualTo(this.expectedCarPlate);
    assertThat(driverAndcar.getCarDto().getBrand()).isEqualTo(this.expectedCarBrand);
    assertThat(driverAndcar.getCarDto().getModel()).isEqualTo(this.expectedCarModel);

  }

}
