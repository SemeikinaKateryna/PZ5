package ua.nure.st.kpp.example.demo.DAO;

import ua.nure.st.kpp.example.demo.entity.*;
import ua.nure.st.kpp.example.demo.myList.MyList;

import java.sql.SQLException;

public interface IMyDAO {
    String NAME_OF_TABLE_ROUTERS = "router";
    String NAME_OF_TABLE_TYPE_OF_ROUTERS = "typeOfRouter";
    String NAME_OF_TABLE_CUSTOMERS = "customer";
    String NAME_OF_TABLE_BUY = "buy";

    // Просмотр информации из всех таблиц
    MyList<Router> getAllRouters();
    MyList<Customer> getAllCustomers();
    MyList<Buy> getAllBuy();
    MyList <TypesOfRouters> getAllTypesOfRouters() ;

    // Поиск роутеров по ID
    Router getRoutersById(int id);

    // Поиск покупателя по фамилии
    Customer getCustomersBySurname(String surname);
    //Поиск покупки по ID товара
    Buy getBuyByRouterID(int id);
    // Добавление нового роутера, покупателя, покупки
    void addRouter (int RouterID, int type, int maxSpeed, double wifiFrequency, int numberOfAntennas, String color,
                    int weight, int power, Protection protection, String brand, double price);
    void addCustomer(int customerID, String surname, String name, String patronymic, String phoneNumber,
                     String deliveryAdress, String email);
    void addBuy (int buyID, String dateOfBuy, int customerID, int fullPrice,
                 String currency, int RouterID);

        // Удаление роутера/покупателя/покупки по заданному ID
    void deleteRouterById(int RouterID);
    void deleteCustomerById(int customerID);
    void deleteBuyById(int buyID) throws SQLException;
    /*void deleteTypeOfRouterById(int typeOfRouterID) throws SQLException;*/
}

