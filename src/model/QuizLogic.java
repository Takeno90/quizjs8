package model;

import dao.QuizDAO;

public class QuizLogic {
	public boolean execute() {
		QuizDAO quizDAO = new QuizDAO();
		quizDAO.getData();

		return true;
	}
}
