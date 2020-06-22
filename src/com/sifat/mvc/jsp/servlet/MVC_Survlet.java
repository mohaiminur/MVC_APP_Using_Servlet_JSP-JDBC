package com.sifat.mvc.jsp.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "MVC_Survlet")
public class MVC_Survlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> students=StudentDataUtil.getStudents();

        request.setAttribute("student_list",students);

        RequestDispatcher dispatcher=request.getRequestDispatcher("index.jsp");


        dispatcher.forward(request,response);
    }
}
