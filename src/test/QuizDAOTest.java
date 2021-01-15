package test;

import dao.QuizDAO;
import model.Quiz;

public class QuizDAOTest {
	public static void main(String[] args) {
		testFindQuiz1();//問題が見つかる場合のテスト
		testFindQuiz2();//問題が見つからない場合のテスト
	}
	public static void testFindQuiz1() {
		int num = 1;
		Quiz quiz = new Quiz(num);
		QuizDAO dao = new QuizDAO();
		Quiz result = dao.getData(num);

		if(result != null &&
			result.getId() == 1 &&
			result.getQuestion().equals(anObject)&&
			result.getChoice1().equals(anObject) &&
			result.getChoice2().equals(anObject) &&
			result.getChoice3().equals() &&
			result.getChoice4().equals() &&
			result.getAnswer().equals("") ) {
			System.out.println("testFindQuiz1():成功しました");
		}else {
			System.out.println("testFindQuiz1():失敗しました");
		}
	}
	public static void testFindQuiz2() {
		int num = -1;
		Quiz quiz = new Quiz(num);
		QuizDAO dao = new QuizDAO();
		Quiz result = dao.getData(num);

		if(result != null &&
			result.getId() == 1 &&
			result.getQuestion().equals(anObject)&&
			result.getChoice1().equals(anObject) &&
			result.getChoice2().equals(anObject) &&
			result.getChoice3().equals() &&
			result.getChoice4().equals() &&
			result.getAnswer().equals("") ) {
			System.out.println("testFindQuiz2():成功しました");
		}else {
			System.out.println("testFindQuiz2():失敗しました");
		}
	}
}
