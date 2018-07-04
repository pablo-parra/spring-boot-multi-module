package pab.par.dom.drivers.config;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Config class for the DB connection of the Drivers service
 *
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "driversEntityManagerFactory", transactionManagerRef = "driversTransactionManager", basePackages = {
"pab.par.dom.drivers" })
public class DriversDbConfig {

  @Primary
  @Bean(name = "driversDataSource")
  @ConfigurationProperties(prefix = "spring.datasource")
  public DataSource dataSource() {

    return DataSourceBuilder.create().build();
  }

  @Primary
  @Bean(name = "driversEntityManagerFactory")
  public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
      @Qualifier("driversDataSource") DataSource dataSource) {

    return builder.dataSource(dataSource).packages("pab.par.dom.drivers").persistenceUnit("drivers").build();
  }

  @Primary
  @Bean(name = "driversTransactionManager")
  public PlatformTransactionManager transactionManager(
      @Qualifier("driversEntityManagerFactory") EntityManagerFactory entityManagerFactory) {

    return new JpaTransactionManager(entityManagerFactory);
  }
}
