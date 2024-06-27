package by.itclass.controllers;

import by.itclass.model.services.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/criteria")
public class CriteriaServlet extends HttpServlet {
    private UserService service;

    @Override
    public void init() throws ServletException {
        service = new UserService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        var params = req.getParameterMap();
        var users = service.getByCriteria(params);
        if (!users.isEmpty()) {
            req.setAttribute("users", users);
        } else {
            req.setAttribute("message", "Users not found");
        }
        req.getRequestDispatcher("/users.jsp").forward(req, resp);
    }
}
