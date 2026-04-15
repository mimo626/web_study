package lab;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lotto1")
public class LottoServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8");

		String responsLottoNum = request.getParameter("lottoNum");
		if(responsLottoNum != null && !responsLottoNum.isEmpty()) {
			
			int lottoNum = Integer.parseInt(responsLottoNum);
			int randomnum = (int)(Math.floor(Math.random() * 6) + 1);
			System.out.println("전달된 값 : " + lottoNum +", 추출된 값 : " + randomnum);
			
			String link = (lottoNum == randomnum) ? "/clientexam/success.html" : "/clientexam/fail.html";
			RequestDispatcher rd =  request.getRequestDispatcher(link);	
			rd.forward(request, response);
		}else {
			System.out.println("전달된 값이 없음");
		}
	}
}
