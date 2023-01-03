package ua.nure.st.kpp.example.demo.form;

public class GetCustomerBySurnameForm {
    private String surname;
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public GetCustomerBySurnameForm(String surname) {
        this.surname = surname;
    }

    public GetCustomerBySurnameForm() {
    }
}
