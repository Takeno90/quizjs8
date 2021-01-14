package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Quiz;

public class QuizDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/quizDB";
	private final String DB_USER = "sa";
	private final String DB_PASS = "200907";

	@SuppressWarnings("null")
	public Quiz getData() {
		Quiz quiz = null;

		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){

			String sql = "SELECT * FROM QUIZJS8 WHERE ID=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, quiz.getId());

			//SELECT文実行、取得
			ResultSet rs = pStmt.executeQuery();

			//取得したデータをインスタンスのフィールドに代入
			if(rs.next()) {
				int id = rs.getInt("ID");
				String question = rs.getString("QUESTION");
				String choice1 = rs.getString("CHICE1");
				String choice2 = rs.getString("CHICE2");
				String choice3 = rs.getString("CHICE3");
				String choice4 = rs.getString("CHICE4");
				String answer = rs.getString("ANSWER");

				quiz = new Quiz(id,question,choice1,choice2,choice3,choice4,answer);
			}

		}catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
		return quiz;
	}
}
