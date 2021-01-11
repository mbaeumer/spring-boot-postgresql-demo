package se.maeumer.springbootlab.postgresql.part3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
