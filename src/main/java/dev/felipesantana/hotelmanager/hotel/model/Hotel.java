package dev.felipesantana.hotelmanager.hotel.model;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document
public class Hotel {
    @MongoId
    private ObjectId _id;
    private String name;
    private String description;
    private LegalInformation legalInformation;
    private Address address;
    private Contact contactInfo;

    public Hotel(String name, String description, LegalInformation legalInformation, Address address, Contact contactInfo) {
        this.name = name;
        this.description = description;
        this.legalInformation = legalInformation;
        this.address = address;
        this.contactInfo = contactInfo;
    }

    public String get_id() {
        return _id.toString();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public LegalInformation getLegalInformation() {
        return legalInformation;
    }

    public Address getAddress() {
        return address;
    }

    public Contact getContactInfo() {
        return contactInfo;
    }
}
