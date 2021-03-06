package se.maeumer.springbootlab.postgresql.part2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    @Override
    List<Contact> findAll();
}
