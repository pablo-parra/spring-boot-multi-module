package pab.par.dom.cars.carmanagement.dataaccess.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Entity for car table
 *
 */
@Entity
@Table(name = "car")
public class Car {

  @Id
  private Integer id;

  @NotNull
  private String plate;

  @NotNull
  private String model;

  @NotNull
  private String brand;

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
   * @return plate
   */
  public String getPlate() {

    return this.plate;
  }

  /**
   * @param plate new value of {@link #getPlate}.
   */
  public void setPlate(String plate) {

    this.plate = plate;
  }

  /**
   * @return model
   */
  public String getModel() {

    return this.model;
  }

  /**
   * @param model new value of {@link #getModel}.
   */
  public void setModel(String model) {

    this.model = model;
  }

  /**
   * @return brand
   */
  public String getBrand() {

    return this.brand;
  }

  /**
   * @param brand new value of {@link #getBrand}.
   */
  public void setBrand(String brand) {

    this.brand = brand;
  }

}
