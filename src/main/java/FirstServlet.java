

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/first") // http://localhost:8088/edu/first?guest=강민주
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8"); // html로 인식, 한글 변환 깨지지 않게 함
		PrintWriter out = response.getWriter();
		out.print("<h1>첫 번째 서블릿 수행</h1>");
		out.print("<hr>");
		out.print("<h2>반가워요 %s님!!</h2>".formatted(request.getParameter("guest")));
	
		out.close();
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
