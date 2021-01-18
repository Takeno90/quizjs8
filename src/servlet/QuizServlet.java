package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Quiz;
import model.QuizLogic;

/**
 * Servlet implementation class QuizServlet
 */
@WebServlet("/QuizServlet")
public class QuizServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public QuizServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		HttpSession session = request.getSession();
		int quizNum = 0;
		if (action == null) {
			//問題の初期値設定
			quizNum = 1;
		} else if(action.equals("done")){
			//問題番号をセッションから取り出す
			quizNum = (int) session.getAttribute("quizNum");
			//加算
			quizNum++;
		}

		//問題をDBから取得

		QuizLogic quizLogic = new QuizLogic();
		Quiz quiz = quizLogic.execute(quizNum);

		if(quiz != null) {
			//問題をセッションスコープに
			session.setAttribute("quiz", quiz);
		}else {
			//終了ページへフォワード
			RequestDispatcher dispatcherEnd = request.getRequestDispatcher("/WEB-INF/jsp/end.jsp");
			dispatcherEnd.forward(request, response);
		}
		//問題番号をセッションスコープに
		session.setAttribute("quizNum", quizNum);

		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/quiz.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//パラメータ取得
		request.setCharacterEncoding("UTF-8");
		String choice = request.getParameter("choice");
		//セッションスコープから問題の解答を取得
		HttpSession session = request.getSession();
		Quiz quiz = (Quiz) session.getAttribute("quiz");
		String quizString = String.valueOf(quiz.getAnswer());

		String forwardPass;

		//正誤判定
		if (choice.equals(quizString)) {
			forwardPass = "/WEB-INF/jsp/right.jsp";
		} else {
			forwardPass = "/WEB-INF/jsp/wrong.jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(forwardPass);
		dispatcher.forward(request, response);
	}
}
