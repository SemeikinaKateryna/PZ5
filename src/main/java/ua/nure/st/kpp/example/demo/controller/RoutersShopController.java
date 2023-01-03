package ua.nure.st.kpp.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.nure.st.kpp.example.demo.DAO.DAOFactory;
import ua.nure.st.kpp.example.demo.DAO.IMyDAO;
import ua.nure.st.kpp.example.demo.DAO.TypeDAO;
import ua.nure.st.kpp.example.demo.entity.Buy;
import ua.nure.st.kpp.example.demo.entity.Customer;
import ua.nure.st.kpp.example.demo.entity.Router;
import ua.nure.st.kpp.example.demo.myList.MyList;

import java.sql.SQLException;

@Controller
public class RoutersShopController {
    private IMyDAO dao = DAOFactory.getDAOInstance(TypeDAO.MY_SQL);

    public RoutersShopController() throws SQLException {
    }

    @RequestMapping(value = { "/routersShop"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String showAllBuy(Model model1, Model model2, Model model3){
        MyList<Router> rlist = dao.getAllRouters();
        MyList<Customer> clist = dao.getAllCustomers();
        MyList<Buy> blist = dao.getAllBuy();
        model1.addAttribute("allRouters", rlist);
        model2.addAttribute("allCustomers", clist);
        model3.addAttribute("allBuy", blist);
        return "routersShopPage";
    }

}
