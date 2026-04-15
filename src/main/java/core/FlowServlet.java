package core;

import java.io.IOException;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/flow")
public class FlowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FlowServlet() {
        super();
        System.out.println("FlowServlet 객체 생성....!");
    }
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init() 메서드 호출.....!");
	}
	public void destroy() {
		System.out.println("destroy() 메서드 호출....!");
	}
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service() 메서드 호출...!");
	}

}
