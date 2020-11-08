package se.maeumer.springbootlab.postgresql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ContatRepository extends JpaRepository<Contact, Long> {

    @Override
    List<Contact> findAll();
}
