package com.servlet.app;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.service.app.UserValidationService;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	private UserValidationService service = new UserValidationService();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int requestCount;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {

			req.getRequestDispatcher("WEB-INF\\views\\login.jsp").forward(req, resp);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String userName = req.getParameter("name");
		String password = req.getParameter("password");
		if (service.validateUser(userName, password)) {
			req.setAttribute("attrName", userName);
			req.setAttribute("attrPassword", password);
			req.getRequestDispatcher("WEB-INF\\views\\welcome.jsp").forward(req, resp);

		} else {
			req.setAttribute("ErrorMessage", "Invalid credentials");
			req.getRequestDispatcher("WEB-INF\\views\\login.jsp").forward(req, resp);
		}
	}

}
