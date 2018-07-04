package pab.par.dom.drivers.drivermanagement.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pab.par.dom.drivers.drivermanagement.dataaccess.entity.Driver;

/**
 * Repository for Driver entity
 *
 */
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
