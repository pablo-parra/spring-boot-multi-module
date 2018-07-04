package pab.par.dom.cars.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Config class for the DB connection of the Cars service
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "carsEntityManagerFactory", transactionManagerRef = "carsTransactionManager", basePackages = {
"pab.par.dom.cars" })
public class CarsDbConfig {

  @Bean(name = "carsDataSource")
  @ConfigurationProperties(prefix = "cars.datasource")
  public DataSource dataSource() {

    return DataSourceBuilder.create().build();
  }

  @Bean(name = "carsEntityManagerFactory")
  public LocalContainerEntityManagerFactoryBean carsEntityManagerFactory(EntityManagerFactoryBuilder builder,
      @Qualifier("carsDataSource") DataSource dataSource) {

    return builder.dataSource(dataSource).packages("pab.par.dom.cars").persistenceUnit("cars").build();
  }

  @Bean(name = "carsTransactionManager")
  public PlatformTransactionManager carsTransactionManager(
      @Qualifier("carsEntityManagerFactory") EntityManagerFactory carsEntityManagerFactory) {

    return new JpaTransactionManager(carsEntityManagerFactory);
  }

}
