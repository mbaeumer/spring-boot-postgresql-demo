package se.maeumer.springbootlab.postgresql;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private ContatRepository contatRepository;

    public ContactService(ContatRepository contatRepository) {
        this.contatRepository = contatRepository;
    }

    public List<Contact> getContacts(){
        List<Contact> contacts = contatRepository.findAll();
        System.out.println(contacts.size());
        return contatRepository.findAll();
    }
}
