package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.PersonDao;
import model.Person;

/**
 * Servlet implementation class PersonController
 */
@WebServlet("/PersonController")
public class PersonController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonController() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

        if (action.equalsIgnoreCase("register")) {
            Person p = new Person();
            
            // Null check for languages
            String[] languages = request.getParameterValues("language");
            String language = (languages != null) ? String.join(", ", languages) : "None"; // Avoid NullPointerException
            
            p.setName(request.getParameter("name"));
            p.setEmail(request.getParameter("email"));
            p.setMobile(request.getParameter("mobile"));
            p.setAddress(request.getParameter("address"));
            p.setPassword(request.getParameter("password"));
            p.setCourse(request.getParameter("course"));
            p.setLanguage(language);
            p.setGender(request.getParameter("gender"));

            System.out.println(p); // Debugging purpose

            HttpSession session = request.getSession();

            // Insert user into database
            int status = PersonDao.insertPerson(p);

            if (status > 0) {
                session.setAttribute("msg", "Data Registered Successfully!");
                session.setAttribute("msgType", "success");
            } else {
                session.setAttribute("msg", "Invalid Registration, Try again!");
                session.setAttribute("msgType", "error");
            }

            response.sendRedirect("signup.jsp"); // Redirect to signup page
        }
	}
}
