package ua.nure.st.kpp.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.nure.st.kpp.example.demo.entity.Buy;
import ua.nure.st.kpp.example.demo.form.AddBuyForm;
import ua.nure.st.kpp.example.demo.form.DeleteBuyForm;
import ua.nure.st.kpp.example.demo.form.GetBuyByRouterIDForm;
import ua.nure.st.kpp.example.demo.myList.MyList;
import ua.nure.st.kpp.example.demo.DAO.IMyDAO;
import ua.nure.st.kpp.example.demo.DAO.DAOFactory;
import ua.nure.st.kpp.example.demo.DAO.TypeDAO;

import java.sql.SQLException;

@Controller
public class BuyController {
    private IMyDAO dao = DAOFactory.getDAOInstance(TypeDAO.MY_SQL);

    public BuyController() throws SQLException {
    }

    @RequestMapping(value = { "/buy"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String showAllBuy(Model model) throws SQLException {
        MyList<Buy> list = dao.getAllBuy();
        model.addAttribute("allBuy", list);
        return "buyPage";
    }

    @RequestMapping(value = {"/addBuy"}, method = RequestMethod.GET)
    public String showAddBuyView(Model model) {
        AddBuyForm addBuyForm = new AddBuyForm();
        model.addAttribute("addBuyForm", addBuyForm);
        return "addBuyPage";
    }

    @RequestMapping(value = {"/addBuy"}, method = RequestMethod.POST)
    public String addBuy(Model model, @ModelAttribute("addBuyForm") AddBuyForm addBuyForm) {
        dao.addBuy(addBuyForm.getBuyID(),addBuyForm.getDateOfBuy(),addBuyForm.getCustomerID(),
                addBuyForm.getFullPrice(),addBuyForm.getCurrency(),addBuyForm.getRouterID());
        return "redirect:/buy";
    }

    @RequestMapping(value = {"/deleteBuyByID"}, method = RequestMethod.GET)
    public String showDeleteBuyView(Model model) {
        DeleteBuyForm deleteBuyForm = new DeleteBuyForm();
        model.addAttribute("deleteBuyForm", deleteBuyForm);
        return "deleteBuyByIDPage";
    }

    @RequestMapping(value = {"/deleteBuyByID"}, method = RequestMethod.POST)
    public String deleteBuy(Model model, @ModelAttribute("deleteBuyForm")
    DeleteBuyForm deleteBuyForm) throws SQLException {
        dao.deleteBuyById((deleteBuyForm.getId()));
        return "redirect:/buy";
    }

    @RequestMapping(value = {"/buyByRouterID"}, method = RequestMethod.GET)
    public String showGetBuyByRouterID(Model model) {
        GetBuyByRouterIDForm getBuyByRouterIDForm = new GetBuyByRouterIDForm();
        model.addAttribute("getBuyByRouterIDForm", getBuyByRouterIDForm);
        return "getBuyByRouterIDPage";
    }

    @RequestMapping(value = {"/buyByRouterID"}, method = RequestMethod.POST)
    public String getBuyByBuyRouterID(Model model, @ModelAttribute("getBuyByRouterIDForm")
    GetBuyByRouterIDForm getBuyByRouterIDForm) {
        Buy b = dao.getBuyByRouterID(getBuyByRouterIDForm.getId());
        if(b == null){
            return "redirect:/buy";
        }
        MyList<Buy> list = new MyList<>();
        list.addLast(b);
        model.addAttribute("allBuy", list);
        return "buyPage";
    }

}
