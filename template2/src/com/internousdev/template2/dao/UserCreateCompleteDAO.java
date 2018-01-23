package com.internousdev.template2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.template2.util.DBConnector;


public class UserCreateCompleteDAO {
	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();

	private String sql=
	"INSERT INTO login_user_transaction(login_id,login_pass,user_name) VALUES(?,?,?)";
	public void createUser(String loginUserId,String loginUserPassword,String userName) throws SQLException{

		try{
			PreparedStatement preparedStatement=
			connection.prepareStatement(sql);
			preparedStatement.setString(1, loginUserId);
			preparedStatement.setString(2,loginUserPassword);
			preparedStatement.setString(3, userName);

			preparedStatement.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
	}

}
