package la.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * BbsServlet
 */
@WebServlet("/BbsServlet")
public class BbsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// フィールド
	List<String> articles = new ArrayList<String>();

	/**
	 * コンストラクタ
	 */
	public BbsServlet() {
		super();
	}

	/**
	 * doGet
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 取得するパラメータの文字コードを設定
		request.setCharacterEncoding("UTF-8");
		// パラメータの取得
		String message = request.getParameter("message");
		String name = request.getParameter("name");
		// messageが取得できたときだけ、書き込み一覧に追加する
		if (message != null && message.length() != 0) {
			articles.add(name + "：" + message);
		}

		// 送信する文字コードの指定
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html><meta charset='UTF-8'><head><title>掲示板</title></head><body>");
		out.println("<form action='/jmaster/BbsServlet' method='post'>");
		out.println("名前：<br>");
		out.println("<input type='text' name='name'><br>");
		out.println("メッセージ：<br>");
		out.println("<textarea name='message' cols='40' rows='5'></textarea><br>");
		out.println("<input type='submit' value='書き込み'></form>");
		out.println("<hr>");

		// 記事一覧を繰り返し処理を利用して表示する
		for (String article : articles) {
			out.println(article);
			out.println("<hr>");
		}

		out.println("</body></html>");

	}

	/**
	 * doPost
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// GetもPostも同じ処理をさせる
		doGet(request, response);
	}

}