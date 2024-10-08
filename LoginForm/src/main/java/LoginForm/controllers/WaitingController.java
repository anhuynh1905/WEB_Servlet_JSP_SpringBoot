package LoginForm.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import LoginForm.Models.UserModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/waiting"})
public class WaitingController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession();
		if(session != null && session.getAttribute("account") != null) {
			UserModel u = (UserModel) session.getAttribute("account");
			req.setAttribute("username", u.getUsername());
			if(u.getRole_id() == 1) {
				resp.sendRedirect(req.getContextPath() + "/admin/home?name=" + u.getUsername());
			}
			else if (u.getRole_id() == 2) {
				resp.sendRedirect(req.getContextPath() + "/manager/homne");
			}
			else
				resp.sendRedirect(req.getContextPath() + "/user/home");
		}else 
			resp.sendRedirect(req.getContextPath() + "/login");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	
}
