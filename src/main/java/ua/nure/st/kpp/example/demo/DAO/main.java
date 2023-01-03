package ua.nure.st.kpp.example.demo.DAO;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException {
        IMyDAO database = DAOFactory.getDAOInstance(TypeDAO.MY_SQL);
        System.out.println(database.getCustomersBySurname("Жижко"));
    }
}
