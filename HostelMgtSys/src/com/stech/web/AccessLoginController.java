package com.stech.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccessLoginController
 */
@WebServlet("/AccessLoginController")   // Annotation
public class AccessLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AccessLoginController() {
        super();
        System.out.println("Hello From Controller");
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
