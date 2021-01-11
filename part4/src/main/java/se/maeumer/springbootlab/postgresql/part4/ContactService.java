package se.maeumer.springbootlab.postgresql.part4;

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

    public List<Contact> getContactsFromCity(){
        return contactRepository.findByAddressCity("Testtown");
    }

    public List<Contact> getContactsByPostalCode(){
        return contactRepository.findByAddressPostalCode("12345");
    }

    public void createContact(final Contact contact){
        contactRepository.save(contact);
    }
}
