package web;

import entities.Product;
import entities.Category;
import dao.IDao;
import metier.ProductDaoImpl;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ProductServlet extends HttpServlet {
    private IDao<Product> productDao = new ProductDaoImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Product> produits = productDao.findAll();
        request.setAttribute("produits", produits);
        RequestDispatcher dispatcher = request.getRequestDispatcher("produits.jsp");
        dispatcher.forward(request, response);
    }
}
