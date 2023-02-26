package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/newCompany")

public class NewServletCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Registering new company");
		PrintWriter out = response.getWriter();
		String nameCompany = request.getParameter("name");
		
		Company company  = new Company();
		company.setName(nameCompany);
		
		DataBaseList dataBaseList = new DataBaseList();
		dataBaseList.addCompany(company);
		
	}

}
