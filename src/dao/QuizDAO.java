package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Quiz;

public class QuizDAO {
	private final String dataBaseName = "quizDB2";

	//	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/"+ dataBaseName;
	private final String JDBC_URL = "jdbc:mysql://localhost/" + dataBaseName + "?serverTimeZone=JST";
	private final String DB_USER = "root";
	private final String DB_PASS = "";

	public Quiz getData(int quizNum) {
		Quiz quiz = null;

		try (Connection conn = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASS)) {

			String sql = "SELECT ID,QUESTION,CHOICE1,CHOICE2,CHOICE3,CHOICE4,ANSWER FROM QUIZJS8 WHERE ID=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, quizNum);

			//SELECT文実行、取得
			ResultSet rs = pStmt.executeQuery();

			//取得したデータをインスタンスのフィールドに代入
			if (rs.next()) {
				int id = rs.getInt("ID");
				String question = rs.getString("QUESTION");
				String choice1 = rs.getString("CHOICE1");
				String choice2 = rs.getString("CHOICE2");
				String choice3 = rs.getString("CHOICE3");
				String choice4 = rs.getString("CHOICE4");
				int answer = rs.getInt("ANSWER");

				quiz = new Quiz(id, question, choice1, choice2, choice3, choice4, answer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return quiz;
	}
}
