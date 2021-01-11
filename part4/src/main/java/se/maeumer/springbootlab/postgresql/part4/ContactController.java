package se.maeumer.springbootlab.postgresql.part4;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("")
    public List<Contact> getAllContacts(){
        return this.contactService.getContacts();
    }

    @GetMapping("/city")
    public List<Contact> getAllContactsByCity(){
        return this.contactService.getContactsFromCity();
    }

    @GetMapping("/postalcode")
    public List<Contact> getAllContactsByPostalCode(){
        return this.contactService.getContactsByPostalCode();
    }

    @PostMapping("")
    public void createContact(@RequestBody final Contact contact){
        contactService.createContact(contact);
    }
}
