package ua.nure.st.kpp.example.demo.DAO;

import java.sql.SQLException;

public class DAOFactory {
	private static IMyDAO dao;

	public static IMyDAO getDAOInstance(TypeDAO type) throws SQLException {
		switch (type) {
		case MY_SQL:
			dao = new MySQLDAO();
			break;
		default:
			dao = null;
			break;
		}
		return dao;
	}
}
