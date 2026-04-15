package lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet("/visitor")
public class VisitorSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿼리문자열 추출할 때 한글 깨지는 점 예방
		request.setCharacterEncoding("utf-8");
		// 응답 내용 추출 
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("name");
		String content = request.getParameter("content");
		LocalDate today = LocalDate.now();
		// 문자열 변수에 바로 간단히 날짜 변환 
		String date = String.format("%1$tY년 %1$tm월 %1$td일", today);
        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 dd일");
        //String formattedDate = today.format(formatter);
        
        // html에서 required했어도 유효성 검사하
        if(userName != null  && !userName.isEmpty() && content != null & !content.isEmpty()) {
        	out.print("<h1>" + userName + "님이 " + date  + "에 남긴 글입니다." );
    		out.print("<hr>");
    		out.print("<h3>" + content +"</h3>");
        }
        // 항상 닫아주
		out.close();
	}

}
