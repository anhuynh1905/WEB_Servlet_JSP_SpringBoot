package LoginForm.controllers.user;

import java.io.IOException;

import LoginForm.Utils.Constant;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UserController extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Get the print writer object to write into the response
		req.getRequestDispatcher("/view/user/home.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		resp.setContentType("text/html");
		HttpSession session = req.getSession();
		Cookie cookie = new Cookie(Constant.SESSION_USERNAME, "");
		cookie.setMaxAge(0);
		cookie.setPath("/");
		resp.addCookie(cookie);
		req.getSession(false).invalidate();
		
		
		backHome(req, resp);
	}
	
	private void backHome(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		resp.sendRedirect(req.getContextPath() + "/login");
	}
}
