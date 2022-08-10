package model;

public abstract class User {

    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() == 10){
            this.phoneNumber = phoneNumber;
        } else {
            System.out.println("El numero de telefono debe ser de 10 digitos, sin 0 y sin 15.");
        }
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return "\nmodel.User: " + name + "\nEmail: " + email +
                "\nAddress: " + address + "\nPhone: " + phoneNumber;
    }
    public abstract void showDataUser();
}
