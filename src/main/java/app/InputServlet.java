package app;

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
    	request.setCharacterEncoding("UTF-8");
    	// ここに必要な処理を記述してください。
    	
    	String carName = request.getParameter("carName");
    	String bodyColor = request.getParameter("bodyColor");
    	String maxSpeed = request.getParameter("maxSpeed");
   	
    	if(Utility.isNullOrEmpty(carName)||Utility.isNullOrEmpty(bodyColor)||Utility.isNullOrEmpty(maxSpeed)) {
    		String result = "未入力の項目があります。";
    		request.setAttribute("result",result);
    		request.getRequestDispatcher("input.jsp").forward(request, response);
    	}
    	int max = 0;
    	int speed = 0;
    	if(Utility.isNumber(maxSpeed)) {
    		max = Integer.parseInt(maxSpeed);
    	}
    	Car car = new Car();
    	car.setCarName(carName);
    	car.setBodyColor(bodyColor);
    	car.setMaxSpeed(max);
    	car.setSpeed(speed);
    	    request.setAttribute("latestCar",car);
    		request.getRequestDispatcher("update.jsp").forward(request, response);	

        // 結果画面へ遷移
            
    }
}
