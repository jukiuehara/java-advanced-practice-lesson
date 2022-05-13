package jp.co.axiz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.axiz.app.App;
import jp.co.axiz.app.CardGameApp;
import jp.co.axiz.app.ClockApp;
import jp.co.axiz.app.DartGameApp;
import jp.co.axiz.app.GameApp;

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
		String game = request.getParameter("1");

		String result = "";
		App app = new CardGameApp();
		
		if (name != null && !name.isEmpty()) {
			switch (game) {
			case "トランプ":
				app = new CardGameApp(game);
				break;
			case "ダーツ":
				app = new DartGameApp(game);
				break;
			case "時計":
				app = new ClockApp();
				break;
			case "その他":
				result = "アプリの実行に失敗しました";
				break;
			}
		}
		if(app instanceof GameApp) {
			GameApp gameApp = (GameApp)app;
			int time = gameApp.getplaytime();
			String playtime = "実行時間："+time;
			request.setAttribute("playtime",playtime );
		}
		if(!(name.equals(""))) {
		result = app.start(name);			
		}


		request.setAttribute("result", result);

		request.getRequestDispatcher("/appStart.jsp").forward(request, response);
	}

}