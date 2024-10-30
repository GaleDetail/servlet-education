package com.example.helloworld;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(true); // створює сесію, якщо її ще немає
        session.setAttribute("username", "user"); // зберігає значення у сесії

        // Перенаправлення на index.html після створення сесії
        response.sendRedirect("index.html");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession(false); // отримує існуючу сесію без її створення
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        if (session != null) { // перевіряємо, чи існує сесія
            String username = (String) session.getAttribute("username"); // отримуємо збережене значення

            String name = request.getParameter("name");
            out.println("<h1>Hello, " + name + " (" + username + ") from POST request!</h1>");
        } else {
            out.println("<h1>Error: No active session found. Please start from the GET request.</h1>");
        }
    }
}
