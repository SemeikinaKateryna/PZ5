package ua.nure.st.kpp.example.demo.form;

public class DeleteBuyForm {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeleteBuyForm(int id) {
        this.id = id;
    }

    public DeleteBuyForm() {
    }

    @Override
    public String toString() {
        return "DeleteCustomerForm{" +
                "id=" + id +
                '}';
    }
}
