package se.maeumer.springbootlab.postgresql.part4;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
//@TestPropertySource(locations = {"classpath:application.properties"})
@SpringBootTest//(classes = PostgreSqlDemo.class)
@AutoConfigureMockMvc
public class ContactControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void createContact() throws Exception {
        mockMvc.perform( MockMvcRequestBuilders
                .post("/contact")
                .content(asJsonString(createTestContact()))
                .contentType(MediaType.APPLICATION_JSON)
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
                //.andExpect(MockMvcResultMatchers.jsonPath("$.employeeId").exists());
    }

    public static String asJsonString(final Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public Contact createTestContact(){
        Contact contact = new Contact();

        contact.setId(Long.valueOf(9999));
        contact.setFirstName("John");
        contact.setLastName("Doe");
        contact.setEmail("john.doe@johndoe.com");
        return contact;
    }


}