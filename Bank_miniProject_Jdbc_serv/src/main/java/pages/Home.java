package pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.UserDao;

@WebServlet("/home")
public class Home extends HttpServlet {

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session == null ||
            session.getAttribute("username") == null) {

            response.sendRedirect("login.html");
            return;
        }

        String username =
                (String) session.getAttribute("username");

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        try {

            UserDao dao = new UserDao();

            ResultSet rs = dao.getUserDetails(username);

            if (rs != null && rs.next()) {

                String fullname = rs.getString("fullname");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String accountType =
                        rs.getString("account_type");

                double balance =
                        rs.getDouble("balance");

                int id = rs.getInt("id");

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Bank Dashboard</title>");
                out.println("</head>");

                out.println("<body>");

                out.println("<h1>Welcome, "
                        + fullname + "!</h1>");

                out.println("<hr>");

                out.println("<h2>Account Details</h2>");

                out.println("<p><b>Customer ID:</b> "
                        + id + "</p>");

                out.println("<p><b>Full Name:</b> "
                        + fullname + "</p>");

                out.println("<p><b>Username:</b> "
                        + username + "</p>");

                out.println("<p><b>Email:</b> "
                        + email + "</p>");

                out.println("<p><b>Phone:</b> "
                        + phone + "</p>");

                out.println("<p><b>Account Type:</b> "
                        + accountType + "</p>");

                out.println("<p><b>Current Balance:</b> "
                        + balance + "</p>");

                out.println("<hr>");

                out.println("<h2>Bank Services</h2>");

                out.println("<p>");
                out.println("<a href='deposit.html'>Deposit Money</a>");
                out.println("</p>");

                out.println("<p>");
                out.println("<a href='withdraw.html'>Withdraw Money</a>");
                out.println("</p>");

                out.println("<p>");
                out.println("<a href='logout'>Logout</a>");
                out.println("</p>");

                out.println("</body>");
                out.println("</html>");

            } else {

                response.getWriter().println(
                        "<h2>User details not found.</h2>");
            }

        } catch (Exception e) {

            e.printStackTrace();

            response.getWriter().println(
                    "<h2>Something went wrong.</h2>");
        }
    }
}