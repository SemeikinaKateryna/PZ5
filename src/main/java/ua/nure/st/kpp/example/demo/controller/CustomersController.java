package ua.nure.st.kpp.example.demo.controller;

import java.sql.SQLException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.nure.st.kpp.example.demo.entity.Customer;
import ua.nure.st.kpp.example.demo.form.AddRouterForm;
import ua.nure.st.kpp.example.demo.form.DeleteCustomerForm;
import ua.nure.st.kpp.example.demo.form.AddCustomerForm;
import ua.nure.st.kpp.example.demo.form.GetCustomerBySurnameForm;
import ua.nure.st.kpp.example.demo.myList.MyList;
import ua.nure.st.kpp.example.demo.pz4.DAO.IMyDAO;
import ua.nure.st.kpp.example.demo.pz4.DAO.DAOFactory;
import ua.nure.st.kpp.example.demo.pz4.DAO.TypeDAO;

@Controller
public class CustomersController {
    private IMyDAO dao = DAOFactory.getDAOInstance(TypeDAO.MY_SQL);

    public CustomersController() throws SQLException {
    }

    @RequestMapping(value = { "/customers"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String showAllCustomers(Model model) throws SQLException {
        MyList<Customer> list = dao.getAllCustomers();
        model.addAttribute("allCustomers", list);
        return "customersPage";
    }

    @RequestMapping(value = {"/addCustomer"}, method = RequestMethod.GET)
    public String showAddCustomerView(Model model) {
        AddCustomerForm addCustomerForm = new AddCustomerForm();
        model.addAttribute("addCustomerForm", addCustomerForm);
        return "addCustomerPage";
    }

    @RequestMapping(value = {"/addCustomer"}, method = RequestMethod.POST)
    public String addCustomer(Model model, @ModelAttribute("addCustomerForm") AddCustomerForm addCustomerForm) {
        dao.addCustomer(addCustomerForm.getCustomerID(),addCustomerForm.getSurname(),
                addCustomerForm.getName(),addCustomerForm.getPatronymic(),
                addCustomerForm.getPhoneNumber(),addCustomerForm.getDeliveryAdress(),
                addCustomerForm.getEmail());
        return "redirect:/customers";
    }

    @RequestMapping(value = {"/deleteCustomersByID"}, method = RequestMethod.GET)
    public String showDeleteCustomerView(Model model) {
        DeleteCustomerForm deleteCustomerForm = new DeleteCustomerForm();
        model.addAttribute("deleteCustomerForm", deleteCustomerForm);
        return "deleteCustomersByIDPage";
    }

    @RequestMapping(value = {"/deleteCustomersByID"}, method = RequestMethod.POST)
    public String deleteCustomer(Model model, @ModelAttribute("deleteCustomerForm") DeleteCustomerForm deleteCustomerForm) {
        dao.deleteCustomerById((deleteCustomerForm.getId()));
        return "redirect:/customers";
    }

    @RequestMapping(value = {"/customersBySurname"}, method = RequestMethod.GET)
    public String showGetCustomerBySurnameView(Model model) {
        GetCustomerBySurnameForm getCustomerBySurnameForm = new GetCustomerBySurnameForm();
        model.addAttribute("getCustomerBySurnameForm", getCustomerBySurnameForm);
        return "getCustomersBySurnamePage";
    }

    @RequestMapping(value = {"/customersBySurname"}, method = RequestMethod.POST)
    public String getCustomerBySurname(Model model, @ModelAttribute("getCustomerBySurnameForm")
    GetCustomerBySurnameForm getCustomerBySurnameForm) {
        Customer c = dao.getCustomersBySurname(getCustomerBySurnameForm.getSurname());
        if(c == null){
            return "redirect:/customers";
        }
        MyList<Customer> list = new MyList<>();
        list.addLast(c);
        model.addAttribute("allCustomers", list);
        return "customersPage";
    }
}
