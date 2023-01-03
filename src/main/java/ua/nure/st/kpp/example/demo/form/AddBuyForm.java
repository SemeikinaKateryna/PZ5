package ua.nure.st.kpp.example.demo.form;


public class AddBuyForm {
    int buyID;
    String dateOfBuy;
    int customerID;
    int fullPrice;
    String currency;
    int RouterID;

    public AddBuyForm(int buyID, String dateOfBuy, int customerID, int fullPrice, String currency,
                      int routerID) {
        this.buyID = buyID;
        this.dateOfBuy = dateOfBuy;
        this.customerID = customerID;
        this.fullPrice = fullPrice;
        this.currency = currency;
        RouterID = routerID;
    }

    public AddBuyForm() {
    }

    public int getBuyID() {
        return buyID;
    }

    public void setBuyID(int buyID) {
        this.buyID = buyID;
    }

    public String getDateOfBuy() {
        return dateOfBuy;
    }

    public void setDateOfBuy(String dateOfBuy) {
        this.dateOfBuy = dateOfBuy;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(int fullPrice) {
        this.fullPrice = fullPrice;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public int getRouterID() {
        return RouterID;
    }

    public void setRouterID(int routerID) {
        RouterID = routerID;
    }

}
