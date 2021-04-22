package la.servlet;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import la.bean.FortuneBean;

/**
 * Servlet implementation class FortuneServlet
 */
@WebServlet("/FortuneServlet")
public class FortuneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public FortuneServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int month = Integer.parseInt(request.getParameter("month"));
		Random rand = new Random();
		String[] color = { "赤", "黄", "白" };
		String[] item = { "タオル", "カバン", "腕時計" };
		String lcolor = color[rand.nextInt(3)];
		String litem = item[rand.nextInt(3)];
		int rank = rand.nextInt(12) + 1;
		FortuneBean fbean = new FortuneBean(month, lcolor, litem, rank);
		request.setAttribute("fortune", fbean);

		RequestDispatcher rd = request.getRequestDispatcher("/fortune.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}