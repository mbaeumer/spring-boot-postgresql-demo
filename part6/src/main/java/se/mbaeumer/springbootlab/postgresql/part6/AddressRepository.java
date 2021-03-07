package se.mbaeumer.springbootlab.postgresql.part6;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
