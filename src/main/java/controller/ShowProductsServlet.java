package controller;

import model.DaoFactory;
import model.Product;
import model.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowProductsServlet", urlPatterns = "/products")
public class ShowProductsServlet  extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        Use the factory to get the Dao object
        Products productsDao = DaoFactory.getProductsDao();

//        Use a methods on the dao to get all the products
        List<Product> products = productsDao.all();

//        Pass the data to the jsp
        request.setAttribute("products", products);
        request.getRequestDispatcher("/Index.jsp").forward(request,response);
    }
}
