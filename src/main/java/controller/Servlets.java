//package controller;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;
//
//@WebServlet(name = "Servlets", urlPatterns = "")
//public class Servlets extends HttpServlet {
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
////------------ Boring Way
////       response.setContentType("text/html");
////        PrintWriter out = response.getWriter();
////        out.println("<h1>Hello, World!</h1>");
//
////______--------Shortcut
////                response.getWriter().println("<h1>hello " + "</h1>");
//
////        -------------to print index.jsp page into server
//
//            request.getRequestDispatcher("/Index.jsp").forward(request,response);
//
//    }
//}
//
