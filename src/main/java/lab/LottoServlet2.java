package lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/lotto2")
public class LottoServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// jsp로 전달하니까 불필요함 
		// response.setContentType("text/html; charset=utf-8");

		String responsLottoNum = request.getParameter("lottoNum");
		if(responsLottoNum != null && !responsLottoNum.isEmpty()) {
			
			int lottoNum = Integer.parseInt(responsLottoNum);
			int randomnum = (int)(Math.floor(Math.random() * 6) + 1);
			System.out.println("전달된 값 : " + lottoNum +", 추출된 값 : " + randomnum);
			
			if(lottoNum == randomnum) {
				request.setAttribute("msg", "당첨~~~ 추카추카");
				request.setAttribute("imginfo", "./images/duke_luau.png");
				request.setAttribute("isSuccess", true);
			} else {
				request.setAttribute("msg", "실패 아쉽아쉽~~~");
				request.setAttribute("imginfo", "./images/duke.png");
				request.setAttribute("isSuccess", false);
			}
			request.getRequestDispatcher("/jspexam/lottoResult.jsp").forward(request, response);
		}else {
			System.out.println("전달된 값이 없음");
		}
	}
}
