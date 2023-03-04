package dev.felipesantana.hotelmanager.hotel.model;

public class Contact {
    private String email;
    private String telephone;
    private String mobilePhone;

    public Contact(String email, String telephone, String mobilePhone) {
        this.email = email;
        this.telephone = telephone;
        this.mobilePhone = mobilePhone;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }
}
