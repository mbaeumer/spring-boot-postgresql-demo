package se.mbaeumer.springbootlab.postgresql.part6;

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
        contactRepository.deleteAll();
        addressRepository.deleteAll();
        Contact contact = new Contact();
        contact.setId(Long.valueOf(0));
        contact.setEmail("test@test.se");
        contact.setFirstName("Martin");
        contact.setLastName("Baeumer");
        contact.setPhoneNumber("0046736398156");

        Address address = new Address();
        AddressId addressId = new AddressId();

        addressId.setStreet("Some Avenue");
        addressId.setPostalCode("12345");
        addressId.setCity("Testtown");
        address.setAddressId(addressId);
        //addressRepository.save(address);
        contact.setAddress(address);
        contactRepository.save(contact);

        contact.setId(Long.valueOf(1));
        contact.setEmail("test@test.com");
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
