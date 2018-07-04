package pab.par.dom.drivers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "pab.par.dom.drivers", "pab.par.dom.cars" })
public class DriversApplication {

  public static void main(String[] args) {

    SpringApplication.run(DriversApplication.class, args);
  }
}
