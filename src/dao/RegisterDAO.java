package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Account;

public class RegisterDAO {
	public final String dataBaseName = "quizDB2";
	public final String JDBC_URL = "jdbc:mysql://localhost/"+dataBaseName + "?serverTimeZone=JST";
	public final String DB_USER = "root";
	public final String DB_PASS = "";

	public boolean setData(Account account) {

		try(Connection conn = DriverManager.getConnection(JDBC_URL,DB_USER,DB_PASS)){
//			SELECT文を追加
			String sql = "INSERT INTO ACCOUNT VALUES (?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1,account.getUserId() );
			pStmt.setString(1,account.getPass() );
			pStmt.setString(1,account.getName() );

			//
			int rs = pStmt.executeUpdate();
			if(rs != 1) {
				return false;
			}

		}catch(SQLException e){
			e.printStackTrace();
			return false;
		}
		return true;

	}
}
