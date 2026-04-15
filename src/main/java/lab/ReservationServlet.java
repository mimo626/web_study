package lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@WebServlet("/reservation")
public class ReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
        String userName = request.getParameter("name");
		String roomName = request.getParameter("room");
		String date = request.getParameter("reservationDate");
		String[] add = request.getParameterValues("add");
		
		if(userName != null && !userName.isEmpty() 
				&& roomName != null && !roomName.isEmpty()
				&& date != null && !date.isEmpty()) {
            
            LocalDate parseDate = LocalDate.parse(date); 
		    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 M월 dd일");
		    String reservationDate = parseDate.format(formatter);
            
			String addContent = "";
			if(add == null || add.length == 0) { // null 체크 추가
				addContent = "없음";
			} else {
				addContent = String.join(", ", add);
			}
			
			out.printf("<h1 style=\"color:blue; font-size:60px;\">%s님의 예약 내용</h1>", userName);
			out.print("<hr>");
			out.print("<ul><li>선택한 룸: " + roomName + "</li>");
			out.print("<li>추가 요청 사항: " + addContent + "</li>");
			out.print("<li>예약 날짜: " + reservationDate + "</li></ul>");
            
		} else {
			out.print("<h1>예약 내용이 불확실하거나 누락되었습니다.</h1>");
		}
	}
}