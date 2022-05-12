package servlet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class StartAppServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	// ここに必要な処理を記述してください。
    	String key = request.getParameter("english");
    	
    	Dictionary dictionary = new Dictionary();
    	
    	String result = "";
    	
    	HashMap<String, String> a = dictionary.getDictionaryInfo();
    	String b = "";
    	String c = "";
    	if(a.containsKey("apple")&&"apple".equals(key)) {
    		c = key;
    		b = a.get("apple");
    	}else if((a.containsKey("orange")&&"orange".equals(key))) {
    		c = key;
    		b = a.get("orange");
    	}else if((a.containsKey("peach")&&"peach".equals(key))) {
    		c = key;
    		b = a.get("peach");
    	}else if((a.containsKey("grape")&&"grape".equals(key))) {
    		c = key;
    		b = a.get("grape");
    	}else if((a.containsKey("pear")&&"pear".equals(key))) {
    		c = key;
    		b = a.get("pear");
    	}else {
    		result = "見つかりませんでした";
    	}
    	if(!(result.equals("見つかりませんでした"))){
    		result = "英語："+c+"、日本語："+b;
    	}
    	request.setAttribute("result", result);
        request.getRequestDispatcher("dictionary.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
        doGet(request, response);
    }
}
