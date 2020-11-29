package se.maeumer.springbootlab.postgresql.part2;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Service;

@Service
public class DatabasePopulationService implements ApplicationListener<ContextRefreshedEvent> {
    private ContactRepository contactRepository;

    public DatabasePopulationService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Contact contact = new Contact();
        contact.setId(0);
        contact.setEmail("test@test.se");
        contact.setFirstName("Martin");
        contact.setLastName("Baeumer");
        contact.setPhoneNumber("0046736398156");
        contactRepository.save(contact);
    }
}
