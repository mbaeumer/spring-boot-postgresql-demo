package se.mbaeumer.springbootlab.postgresql.part6;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Override
    List<Contact> findAll();

    List<Contact> findByAddress_AddressId_City(String city);

    List<Contact> findByAddress_AddressId_PostalCode(String postalCode);
}
