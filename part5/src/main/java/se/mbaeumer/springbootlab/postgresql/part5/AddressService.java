package se.mbaeumer.springbootlab.postgresql.part5;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }
}
