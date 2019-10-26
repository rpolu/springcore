package com.elegent.sp.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.elegent.user.model.UserModel;

public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String userid = request.getParameter("uid");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String address = request.getParameter("address");
		String phonenum = request.getParameter("phnum");

		UserModel userModel = new UserModel();
		userModel.setEmail(email);
		userModel.setUserid(userid);
		userModel.setFname(fname);
		userModel.setLname(lname);
		userModel.setAddrtess(address);
		userModel.setPhnum(phonenum);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><center>" + "<h2>User registartion Success. Please login here .<h2><br><br>");
		pw.println("</center></body></html>");
		requestDispatcher.include(request, response);

	}

}
