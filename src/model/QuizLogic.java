package model;

import dao.QuizDAO;

public class QuizLogic {
	public boolean execute(int quizNum) {
		QuizDAO quizDAO = new QuizDAO();

		Quiz quiz = quizDAO.getData(quizNum);

		return quiz != null;
	}
}
