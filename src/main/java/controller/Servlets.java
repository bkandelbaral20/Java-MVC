package controller;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="Servlets", urlPatterns = "")
public class Servlets extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        response.getWriter().println("<h1>hello " + "</h1>");
        request.getRequestDispatcher("/Index.jsp").forward(request,response);
    }
}
