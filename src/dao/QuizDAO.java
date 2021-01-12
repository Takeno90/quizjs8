package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import model.Quiz;

public class QuizDAO {
	private final String JDBC_URL = "jdbc:h2:tcp://localhost/~/quizDB";
	private final String DB_USER = "sa";
	private final String DB_PASS = "200907";

	public Quiz getData() {
		Quiz quiz = null;

		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){

			String sql = "SELECT * FROM QUIZJS8 WHERE ID=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, );
		}
	}
}
