package pab.par.dom.drivers.drivermanagement.dataaccess.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Entity class for driver table
 *
 */
@Entity
@Table(name = "driver")
public class Driver {

  @Id
  private Integer id;

  @NotNull
  private String name;

  @Column(name = "last_name")
  @NotNull
  private String lastName;

  @Column(name = "car_plate")
  @NotNull
  private String carPlate;

  /**
   * @return id
   */
  public Integer getId() {

    return this.id;
  }

  /**
   * @param id new value of {@link #getId}.
   */
  public void setId(Integer id) {

    this.id = id;
  }

  /**
   * @return name
   */
  public String getName() {

    return this.name;
  }

  /**
   * @param name new value of {@link #getName}.
   */
  public void setName(String name) {

    this.name = name;
  }

  /**
   * @return lastName
   */
  public String getLastName() {

    return this.lastName;
  }

  /**
   * @param lastName new value of {@link #getLastName}.
   */
  public void setLastName(String lastName) {

    this.lastName = lastName;
  }

  /**
   * @return carPlate
   */
  public String getCarPlate() {

    return this.carPlate;
  }

  /**
   * @param carPlate new value of {@link #getCarPlate}.
   */
  public void setCarPlate(String carPlate) {

    this.carPlate = carPlate;
  }

}
