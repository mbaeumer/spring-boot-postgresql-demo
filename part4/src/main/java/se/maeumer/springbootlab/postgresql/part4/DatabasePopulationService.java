package se.maeumer.springbootlab.postgresql.part4;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class DatabasePopulationService implements ApplicationListener<ContextRefreshedEvent> {
    private ContactRepository contactRepository;
    private AddressRepository addressRepository;

    public DatabasePopulationService(ContactRepository contactRepository, AddressRepository addressRepository) {
        this.contactRepository = contactRepository;
        this.addressRepository = addressRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Contact contact = new Contact();
        contact.setId(Long.valueOf(0));
        contact.setEmail("test@test.se");
        contact.setFirstName("Martin");
        contact.setLastName("Baeumer");
        contact.setPhoneNumber("0046736398156");

        Address address = new Address();
        address.setId(0);
        address.setStreet("Some Avenue");
        address.setPostalCode("12345");
        address.setCity("Testtown");
        //addressRepository.save(address);
        contact.setAddress(address);
        contactRepository.save(contact);

        contact.setId(Long.valueOf(1));
        contact.setEmail("test@test.se");
        contact.setFirstName("Martin");
        contact.setLastName("Baeumer");
        contact.setPhoneNumber("0046736398156");

        contact.setAddress(address);
        contactRepository.save(contact);

        contact.setId(Long.valueOf(2));
        contact.setEmail("test@test.se");
        contact.setFirstName("Martin");
        contact.setLastName("Baeumer");
        contact.setPhoneNumber("0046736398156");
        contact.setAddress(null);

        contactRepository.save(contact);


    }
}
