package test;

import model.QuizLogic;

public class QuizLogicTest {

	public static void main(String[] args) {
		testExecute1();
		testExecute1();

	}
	public static void testExecute1() {
		int num = 1;
		QuizLogic bo = new QuizLogic();
		boolean result = bo.execute(num);
		if(result) {
			System.out.println("testExecute1():成功しました");
		}else {
			System.out.println("testExecute1():失敗しました");
		}
	}
	public static void testExecute2() {
		int num = 0;
		QuizLogic bo = new QuizLogic();
		boolean result = bo.execute(num);
		if(!result) {
			System.out.println("testExecute1():成功しました");
		}else {
			System.out.println("testExecute1():失敗しました");
		}
	}

}
