package pages;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.LoginDao;

@WebServlet("/login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Login() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.getWriter().append("Served at: ")
                .append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Get form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Call DAO
        LoginDao dao = new LoginDao();
        boolean status = dao.validateUser(username, password);

        if (status) {
            // Login successful
        	HttpSession session = request.getSession();
        	session.setAttribute("username",username);
        	response.sendRedirect("home");
        } else {
            // Login failed
            request.setAttribute("error", "Invalid username or password");
            request.getRequestDispatcher("login.html")
                   .forward(request, response);
        }
    }
}