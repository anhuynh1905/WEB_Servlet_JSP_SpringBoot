package LoginForm.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import LoginForm.DAO.IUserModel;
import LoginForm.DAO.impl.UserModelImpl;
import LoginForm.Models.UserModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/reset" })
public class ForgetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	IUserModel user = new UserModelImpl();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/view/forgetpassword.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		resp.setCharacterEncoding("UTF-8");
		req.setCharacterEncoding("UTF-8");
		
		String username = req.getParameter("username");
		String password = req.getParameter("new_pass");
		int id = Integer.parseInt(req.getParameter("id"));
		
		if(user.findByUsername(username).getID() == id) {
			user.change_pass(password, id);
			resp.sendRedirect("/LoginForm/login");
		}
		else {
			PrintWriter pw = resp.getWriter();
			pw.write(user.findByUsername(username).getID() + ", " + id);
			pw.close();
		}
	
	}
}
