package pab.par.dom.cars.logic.dto;

/**
 * Data Transfer Object for Car entity
 *
 */
public class CarDTO {

  private Integer id;

  private String plate;

  private String model;

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
