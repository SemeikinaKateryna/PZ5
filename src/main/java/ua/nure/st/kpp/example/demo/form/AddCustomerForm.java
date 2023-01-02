package ua.nure.st.kpp.example.demo.form;

public class AddCustomerForm {
    int customerID;
    String surname;
    String name;
    String patronymic;
    String phoneNumber;
    String deliveryAdress;
    String email;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDeliveryAdress() {
        return deliveryAdress;
    }

    public void setDeliveryAdress(String deliveryAdress) {
        this.deliveryAdress = deliveryAdress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AddCustomerForm() {
    }

    public AddCustomerForm(String surname, String name, String patronymic,
                           String phoneNumber, String deliveryAdress, String email) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.phoneNumber = phoneNumber;
        this.deliveryAdress = deliveryAdress;
        this.email = email;
    }

    @Override
    public String toString() {
        return "AddCustomerForm{" +
                "customerID=" + customerID +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", deliveryAdress='" + deliveryAdress + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
