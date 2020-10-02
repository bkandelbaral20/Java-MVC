package controller;
import model.DaoFactory;
import model.Pizza;
import model.Pizzas;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowPizzaServlet", urlPatterns = "/pizza")
public class ShowPizzaServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        Use the factory to get the Dao object
        Pizzas pizzasDao = (Pizzas) DaoFactory.getProductsDao();

//        Use a methods on the dao to get all the products
        List<Pizza> pizzas = pizzasDao.all();

//        Pass the data to the jsp
        request.setAttribute("pizzas", pizzas);
        request.getRequestDispatcher("/Index.jsp").forward(request,response);
    }
}
