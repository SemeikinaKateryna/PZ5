package ua.nure.st.kpp.example.demo.form;

public class DeleteCustomerForm {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeleteCustomerForm(int id) {
        this.id = id;
    }

    public DeleteCustomerForm() {
    }

    @Override
    public String toString() {
        return "DeleteCustomerForm{" +
                "id=" + id +
                '}';
    }
}
