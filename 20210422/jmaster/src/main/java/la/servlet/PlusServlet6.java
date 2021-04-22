package la.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import la.bean.PlusBean;

/**
 * PlusServlet
 */
@WebServlet("/PlusServlet6")
public class PlusServlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * コンストラクタ
	 */
	public PlusServlet6() {
		super();
	}

	/**
	 * doPost
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// パラメータの取得
		String num1 = request.getParameter("value1");
		String num2 = request.getParameter("value2");

		int i1 = Integer.parseInt(num1);
		int i2 = Integer.parseInt(num2);
		int answer = i1 + i2;

		// 変数名beanのPlusBeanオブジェクト生成
		// Car c1 = new Car("TOYOTA", 2000, "白");と同じ
		PlusBean bean = new PlusBean(i1, i2, answer);

		// リクエストスコープに計算結果を保存する
		request.setAttribute("plus", bean);

		// answer.jspに処理を転送する
		RequestDispatcher rd = request.getRequestDispatcher("/answer.jsp");
		rd.forward(request, response);
	}
}