package pab.par.dom.drivers.drivermanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import pab.par.dom.drivers.drivermanagement.logic.bussines.Drivermanagement;
import pab.par.dom.drivers.drivermanagement.logic.dto.DriverWithCarDTO;

/**
 * REST controller for Drivers service
 *
 */
@Controller
@CrossOrigin
@RequestMapping("/api/v1")
public class DriversController {

  @Autowired
  private Drivermanagement drivermanagement;

  /**
   * @return the list of all drivers in the DB
   */
  @RequestMapping(value = "/getDrivers", method = RequestMethod.GET)
  public @ResponseBody ResponseEntity<?> getDrivers() {

    return new ResponseEntity<>(this.drivermanagement.getAllDrivers(), HttpStatus.OK);
  }

  /**
   * @return the list of all drivers in the DB
   */
  @RequestMapping(value = "/getDriverWithCarData/{id}", method = RequestMethod.GET)
  public @ResponseBody ResponseEntity<DriverWithCarDTO> getDriverWithCarData(@PathVariable("id") Integer id) {

    return new ResponseEntity<>(this.drivermanagement.getDriverWithCarData(id), HttpStatus.OK);
  }

}
