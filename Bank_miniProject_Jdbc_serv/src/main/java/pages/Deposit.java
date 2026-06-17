package pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.TransactionDao;

@WebServlet("/deposit")
public class Deposit extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession session = request.getSession(false);

        if (session == null || session.getAttribute("username") == null) {
            response.sendRedirect("login.html");
            return;
        }

        String username = (String) session.getAttribute("username");

        double amount = Double.parseDouble(
                request.getParameter("amount"));

        TransactionDao dao = new TransactionDao();

        boolean status = dao.deposit(username, amount);

        if (status) {
            response.getWriter().println(
                    "<h2>₹" + amount +
                    " deposited successfully!</h2>" +
                    "<br><a href='home'>Back to Dashboard</a>");
        } else {
            response.getWriter().println(
                    "<h2>Deposit failed.</h2>" +
                    "<br><a href='home'>Back to Dashboard</a>");
        }
    }
}