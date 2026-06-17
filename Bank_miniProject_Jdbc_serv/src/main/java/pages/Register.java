package pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.RegisterDao;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {

		String fullname = request.getParameter("fullname");
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
		String accountType = request.getParameter("accountType");
		double balance = Double.parseDouble(request.getParameter("balance"));
		String password = request.getParameter("password");

		RegisterDao dao = new RegisterDao();

		boolean status = dao.registerUser(
		        fullname,
		        username,
		        email,
		        phone,
		        accountType,
		        balance,
		        password
		);

	    if (status) {
	        response.sendRedirect("login.html");
	    } else {
	        request.setAttribute("error", "Registration failed");
	        request.getRequestDispatcher("register.html")
	               .forward(request, response);
	    }
	}

}
