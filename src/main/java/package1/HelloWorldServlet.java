package package1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/hello")


public class HelloWorldServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out =  resp.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.println("hello, world, congratz");
		out.println("test");
		out.println("</body");
		out.println("</html");
		
	}

}
