package core;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/empselect")
public class EmpSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e) {
			response.sendError(500, "ㅠㅠ JDBC 드라이버 오류");
			return;
		}
		String url = "jdbc:mysql://localhost:3306/edudb?characterEncoding=UTF-8&serverTimezone=UTC";
		String user = "jdbctest";
		String passwd = "jdbctest";
		out.print("<h2>지원명단</h2><hr><ul>");
		try (Connection conn = DriverManager.getConnection(url, user, passwd);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("select ename, sal  from emp");){			
			while (rs.next()) {
				out.printf("<li>%10s(%d)</li>", rs.getString("ename"), rs.getInt("sal"));
			}
			out.print("</ul>");
		} catch(SQLException e) {
			response.sendError(500, "DB 연동 오류");
			e.printStackTrace();
			return;	
		}		
	}
}
