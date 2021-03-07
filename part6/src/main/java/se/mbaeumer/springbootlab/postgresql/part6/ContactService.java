package se.mbaeumer.springbootlab.postgresql.part6;

import org.hibernate.PropertyValueException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

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
        return contactRepository.findByAddress_AddressId_City("Testtown");
    }

    public List<Contact> getContactsByPostalCode(){
        return contactRepository.findByAddress_AddressId_PostalCode("12345");
    }

    public void createContact(final Contact contact){
        try {
            contactRepository.save(contact);
        }catch (DataIntegrityViolationException ex){
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST);
        }
    }

    public void deleteContact(final Long id){
        contactRepository.deleteById(id);
    }
}
