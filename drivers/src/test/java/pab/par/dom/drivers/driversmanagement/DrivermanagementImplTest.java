package pab.par.dom.drivers.driversmanagement;

import static org.assertj.core.api.Assertions.assertThat;

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

  /**
   * Checks the process that fills the Driver and Car data
   */
  @Test
  public void getDriverWithCarDataTest() {

    int id = 1;
    DriverWithCarDTO driverAndcar = this.drivermanagement.getDriverWithCarData(id);

    assertThat(driverAndcar).isNotNull();

  }

}
