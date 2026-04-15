package lab;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/lotto3")
public class LottoServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String responsLottoNum = request.getParameter("lottoNum");
		if(responsLottoNum != null && !responsLottoNum.isEmpty()) {
			
			int lottoNum = Integer.parseInt(responsLottoNum);
			int randomnum = (int)(Math.floor(Math.random() * 6) + 1);
			System.out.println("전달된 값 : " + lottoNum +", 추출된 값 : " + randomnum);
			HttpSession session = request.getSession();
			
			if(session.getAttribute("cnt") == null) {
			    session.setAttribute("cnt", new int[1]);
			}
			
			int[] count = (int[])session.getAttribute("cnt");
			
			System.out.println("현재 시도 횟수: " + count[0]);
			boolean isTry = true; 
			
			if( count[0] < 3) {
				if(lottoNum == randomnum) {
					request.setAttribute("msg", "당첨~~~ 추카추카");
					request.setAttribute("imginfo", "./images/duke_luau.png");
					request.setAttribute("isSuccess", true);
					count[0] = 3;
					 isTry = false;

				} else {
					count[0]++;
					request.setAttribute("msg", "실패 아쉽아쉽~~~");
					request.setAttribute("imginfo", "./images/duke.png");
					request.setAttribute("isSuccess", false);
				}
			} else {
				request.setAttribute("msg", "더 이상 응모할 수 없어요… 브라우저를 재기동한 후에는 가능하답니다.");

			    isTry = false;
			}
	
			request.setAttribute("isTry", isTry);
			
			request.getRequestDispatcher("/jspexam/lottoResult3.jsp").forward(request, response);
		}else {
			System.out.println("전달된 값이 없음");
		}
	}
}
