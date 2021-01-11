package se.maeumer.springbootlab.postgresql.part3;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Override
    List<Contact> findAll();

    List<Contact> findByAddressCity(String city);

    List<Contact> findByAddressPostalCode(String postalCode);
}
