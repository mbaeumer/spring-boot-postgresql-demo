package se.mbaeumer.springbootlab.postgresql.part6;

import javax.persistence.*;

@Entity
public class Address {
    @EmbeddedId
    private AddressId addressId;

    public AddressId getAddressId() {
        return addressId;
    }

    public void setAddressId(AddressId addressId) {
        this.addressId = addressId;
    }
}
