package model;

import dao.QuizDAO;

public class QuizLogic {
	public boolean execute(int quizNum) {
		QuizDAO quizDAO = new QuizDAO();
		quizDAO.getData(quizNum);

		return true;
	}
}
