package pab.par.dom.drivers.dataaccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pab.par.dom.drivers.dataaccess.entity.Driver;

/**
 * Repository for Driver entity
 *
 */
public interface DriverRepository extends JpaRepository<Driver, Integer> {

}
