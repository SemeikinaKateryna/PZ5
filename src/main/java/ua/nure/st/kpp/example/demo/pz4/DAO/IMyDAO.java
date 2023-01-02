package ua.nure.st.kpp.example.demo.pz4.DAO;

import ua.nure.st.kpp.example.demo.entity.Protection;
import ua.nure.st.kpp.example.demo.entity.Router;
import ua.nure.st.kpp.example.demo.myList.MyList;
import ua.nure.st.kpp.example.demo.entity.Customer;
import ua.nure.st.kpp.example.demo.pz4.TypesOfRouters;

import java.sql.SQLException;

public interface IMyDAO {
    String NAME_OF_TABLE_ROUTERS = "router";
    String NAME_OF_TABLE_TYPE_OF_ROUTERS = "typeOfRouter";
    String NAME_OF_TABLE_CUSTOMERS = "customer";
    String NAME_OF_TABLE_BUY = "buy";


    // Просмотр информации из всех таблиц
    MyList getAllRouters() throws SQLException;
    MyList getAllCustomers() throws SQLException;
    MyList getAllBuy() throws SQLException;
    MyList <TypesOfRouters> getAllTypesOfRouters() ;


    // Поиск роутеров по каждой из своих характеристик
    Router getRoutersById(int id);
    /*void getRoutersByType(int type) throws SQLException;
    void getRoutersByMaxSpeed(int maxSpeed) throws SQLException;
    void getRoutersByWifiFrequency(double wifiFrequency) throws SQLException;
    void getRoutersByNumberOfAntennas(int numberOfAntennas) throws SQLException;
    void getRoutersByColor(String color) throws SQLException;
    void getRoutersByWeight(int weight) throws SQLException;
    void getRoutersByPower(int power) throws SQLException;
    void getRoutersByProtection(Protection protection) throws SQLException;
    void getRoutersByBrand(String brand) throws SQLException;
    void getRoutersByPrice(double price) throws SQLException;*/
    Customer getCustomersBySurname(String surname);
    // Добавление нового роутера, его типа, покупателя, покупки
    void addRouter (int RouterID, int type, int maxSpeed, double wifiFrequency, int numberOfAntennas, String color,
                    int weight, int power, Protection protection, String brand, double price);
    void addCustomer(int customerID, String surname, String name, String patronymic, String phoneNumber,
                     String deliveryAdress, String email);
    /*void addBuy (int buyID, Date dateOfBuy, int customerID, int fullPrice, String currency, int RouterID)
            throws SQLException;
    void addTypeOfRouter(int typeOfRouterID, String description) throws SQLException;*/

    // Изменение стоимости роутера по заданному ID
    //void changePriceRouter(int newPrice, int RouterID) throws SQLException;
    // Изменение номера телефона покупателя по фамилии
    /*void changePhoneNumberCustomer( String newPhoneNumber, String surname) throws SQLException;
    void changeDateOfBuy(Date newDateOfBuy,int buyID) throws SQLException;*/

        // Удаление роутера/покупателя/покупки по заданному ID
    void deleteRouterById(int RouterID);
    void deleteCustomerById(int customerID);
    /*void deleteBuyById(int buyID) throws SQLException;
    void deleteTypeOfRouterById(int typeOfRouterID) throws SQLException;*/
}

