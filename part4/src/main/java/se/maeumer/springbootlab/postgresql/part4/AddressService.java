package se.maeumer.springbootlab.postgresql.part4;

import org.springframework.stereotype.Service;

@Service
public class AddressService {
    private AddressRepository addressRepository;

    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public void deleteAddress(final Long id){
        addressRepository.deleteById(id);
    }
}
