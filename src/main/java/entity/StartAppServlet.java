package entity;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import app.CardGameApp;
import app.ClockApp;
import app.DartGameApp;

/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/StartAppServlet")
public class StartAppServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public StartAppServlet() {
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
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String app = request.getParameter("1");

		String result = "";

		if (name != null && !name.isEmpty()) {
			switch (app) {
			case "トランプ":
				CardGameApp a = new CardGameApp(app);
				result = a.start(name);
				break;
			case "ダーツ":
				DartGameApp b = new DartGameApp(app);
				result = b.start(name);
				break;
			case "時計":
				ClockApp c = new ClockApp();
				result = c.start(name);
				break;
			case "その他":
				result = "アプリの実行に失敗しました";
				break;

			}
		}

		request.setAttribute("result", result);
		request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}