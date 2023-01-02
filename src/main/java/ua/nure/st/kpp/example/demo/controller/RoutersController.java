package ua.nure.st.kpp.example.demo.controller;

import java.sql.SQLException;
import java.util.EnumSet;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.nure.st.kpp.example.demo.form.DeleteRouterForm;
import ua.nure.st.kpp.example.demo.form.GetRouterByIDForm;
import ua.nure.st.kpp.example.demo.form.AddRouterForm;
import ua.nure.st.kpp.example.demo.entity.Protection;
import ua.nure.st.kpp.example.demo.entity.Router;
import ua.nure.st.kpp.example.demo.myList.MyList;
import ua.nure.st.kpp.example.demo.pz4.DAO.IMyDAO;
import ua.nure.st.kpp.example.demo.pz4.DAO.DAOFactory;
import ua.nure.st.kpp.example.demo.pz4.DAO.TypeDAO;

@Controller
public class RoutersController {
    private IMyDAO dao = DAOFactory.getDAOInstance(TypeDAO.MY_SQL);

    public RoutersController() throws SQLException {
    }

    @RequestMapping(value = { "/routers"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String showAllRouters(Model model) throws SQLException {
        MyList<Router> list = dao.getAllRouters();
        model.addAttribute("allRouters", list);
        return "routersPage";
    }

    @RequestMapping(value = {"/addRouter"}, method = RequestMethod.GET)
    public String showAddRouterView(Model model) {
        AddRouterForm addRouterForm = new AddRouterForm();
        model.addAttribute("addRouterForm", addRouterForm);
        model.addAttribute("ListTypesOfRouters", dao.getAllTypesOfRouters());
        model.addAttribute("ListProtection", EnumSet.allOf(Protection.class));
        return "addRouterPage";
    }

    @RequestMapping(value = {"/addRouter"}, method = RequestMethod.POST)
    public String addRouter(Model model, @ModelAttribute("addRouterForm") AddRouterForm addRouterForm) {
        dao.addRouter(addRouterForm.getRouterID(),addRouterForm.getTypeOfRouterID(),
                addRouterForm.getMaxSpeed(),addRouterForm.getWifiFrequency(),
                addRouterForm.getNumberOfAntennas(),addRouterForm.getColor(),addRouterForm.getWeight(),
                addRouterForm.getPower(),addRouterForm.getProtection(),addRouterForm.getBrand(),
                addRouterForm.getPrice());
        return "redirect:/routers";
    }

    @RequestMapping(value = {"/deleteRoutersByID"}, method = RequestMethod.GET)
    public String showDeleteRouterView(Model model) {
        DeleteRouterForm deleteRouterForm = new DeleteRouterForm();
        model.addAttribute("deleteRouterForm", deleteRouterForm);
        return "deleteRoutersByIDPage";
    }

    @RequestMapping(value = {"/deleteRoutersByID"}, method = RequestMethod.POST)
    public String deleteRouter(Model model, DeleteRouterForm deleteRouterForm) {
        dao.deleteRouterById((deleteRouterForm.getId()));
        return "redirect:/routers";
    }

    @RequestMapping(value = {"/routersByID"}, method = RequestMethod.GET)
    public String showGetRouterByIDView(Model model) {
        GetRouterByIDForm getRouterByIDForm = new GetRouterByIDForm();
        model.addAttribute("getRouterByIDForm", getRouterByIDForm);
        return "getRoutersByIDPage";
    }

    @RequestMapping(value = {"/routersByID"}, method = RequestMethod.POST)
    public String getRouterByID(Model model, GetRouterByIDForm getRouterByIDForm) {
        Router r = dao.getRoutersById(getRouterByIDForm.getId());
        if(r == null){
            return "redirect:/routers";
        }
        MyList<Router> list = new MyList<>();
        list.addLast(r);
        model.addAttribute("allRouters", list);
        return "routersPage";
    }
}

