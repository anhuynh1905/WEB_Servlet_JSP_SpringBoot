package LoginForm.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import LoginForm.Models.UserModel;
import LoginForm.Services.IUserService;
import LoginForm.Services.impl.UserServiceImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/createAccount"})
public class createAccount extends HttpServlet {
	IUserService user = new UserServiceImpl();
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/view/CreateAccount.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");  
	    Date date = new Date();  
		
		
		UserModel u = new UserModel();
		u.setUsername(req.getParameter("username"));
		u.setPassword(req.getParameter("password"));
		u.setAvatar(req.getParameter("avatar"));
		u.setEmail(req.getParameter("email"));
		u.setFirst_name(req.getParameter("First_name"));
		u.setLast_name(req.getParameter("Last_name"));
		u.setID(Integer.parseInt(req.getParameter("id")));
		u.setRole_id(Integer.parseInt(req.getParameter("role_id")));
		u.setPhone_number(Integer.parseInt(req.getParameter("phone_number")));
		u.setMy_Date(formatter.format(date));
		
		user.createAccount(u);
		resp.sendRedirect("/LoginForm/login");
	}
}
