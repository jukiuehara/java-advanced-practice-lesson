package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.products;
import service.ProductService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		if("".equals(id)) {
			request.setAttribute("msg", "product_idを入力してください");
			request.getRequestDispatcher("top.jsp").forward(request, response);
            return;
		}
		ProductService ps = new ProductService();
		products p =  ps.authentication(id);
        if (p != null) {
            request.setAttribute("msg", "データを取得しました ");
            request.setAttribute("id","product_id:" +p.getproduct_id());
            request.setAttribute("name","product_name:" +p.getproduct_name());
            request.setAttribute("price","price:" +p.getprice());

            request.getRequestDispatcher("searchResult.jsp").forward(request, response);
        } else {

            request.setAttribute("msg", "対象のデータはありません");

            request.getRequestDispatcher("top.jsp").forward(request, response);
        }
		doGet(request, response);
	}

}
