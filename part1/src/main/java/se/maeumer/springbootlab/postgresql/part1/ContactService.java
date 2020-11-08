package se.maeumer.springbootlab.postgresql.part1;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public List<Contact> getContacts(){
        List<Contact> contacts = contactRepository.findAll();
        System.out.println(contacts.size());
        return contactRepository.findAll();
    }
}
