package pages;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import dao.TransactionDao;

@WebServlet("/withdraw")
public class Withdraw extends HttpServlet {

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

        boolean status = dao.withdraw(username, amount);

        if (status) {
            response.getWriter().println(
                    "<h2>₹" + amount +
                    " withdrawn successfully!</h2>" +
                    "<br><a href='home'>Back to Dashboard</a>");
        } else {
            response.getWriter().println(
                    "<h2>Insufficient balance or withdrawal failed.</h2>" +
                    "<br><a href='home'>Back to Dashboard</a>");
        }
    }
}