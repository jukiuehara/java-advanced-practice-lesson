
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/inputServlet")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InputServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// ここに必要な処理を記述してください。
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String language = request.getParameter("language");
		String birthPlace = request.getParameter("birthPlace");
		String btn = request.getParameter("btn");
		// 結果画面へ
		String info = "";
		boolean isSimple = false;
		if(btn.equals("simple")) {
			isSimple = true;
		}else if(btn.equals("details")) {
			isSimple = false;	
		}
		Human h = new Human();
		if(isSimple) {
		switch (birthPlace) {
		case "japan":
			h = new Japanese();
			break;
		case "america":
			h = new American();
			break;
		default:
			h = new Human(name,language);
	    break;
		}			
		}else if(!(isSimple)) {
			switch (birthPlace) {
			case "japan":
				h = new Japanese(name,language);
				break;
			case "america":
				h = new American(name,language);
				break;
			default:
				h = new Human(name,language);
		    break;
			}	
		}
				info = h.returnHumanInfo();

		request.setAttribute("info", info);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}
