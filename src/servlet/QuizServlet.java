package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");

		HttpSession session = request.getSession();
		int quizNum = 0;
		if(action == null) {
			//問題の初期値設定
			quizNum = 1;
			//セッションスコープに代入
//			session.setAttribute("quizNum", quizNum);
		}else {
			//問題番号をセッションから取り出す
//			quizNum = (int) session.getAttribute("quizNum");
			//加算
			quizNum++;
			//セッションスコープに代入
//			session.setAttribute("quizNum", quizNum);
		}
		//セッションスコープに代入
//		session.setAttribute("quizNum", quizNum);
//		//問題をDBから取得
//		QuizLogic quizLogic = new QuizLogic();
//		boolean isLogic = quizLogic.execute(quizNum);
//		if(isLogic) {
//			Quiz quiz = new Quiz();
//			
//		}
		//フォワード
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/quiz.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
