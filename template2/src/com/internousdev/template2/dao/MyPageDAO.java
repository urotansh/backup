package com.internousdev.template2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template2.dto.MyPageDTO;
import com.internousdev.template2.util.DBConnector;

public class MyPageDAO {

	private DBConnector dbConnector=new DBConnector();
	private Connection connection=dbConnector.getConnection();
	private MyPageDTO myPageDTO=new MyPageDTO();

	public MyPageDTO getMyPageUserInfo(String item_transaction_id,
	String user_master_id) throws SQLException{
		String sql="SELECT total_price,total_count,pay FROM user_buy_item_transaction where item_transaction_id=? AND user_master_id=?";

		try{
			PreparedStatement preparedStatement=
			connection.prepareStatement(sql);
			preparedStatement.setString(1, item_transaction_id);
			preparedStatement.setString(2, user_master_id);

			ResultSet resultSet=preparedStatement.executeQuery();

			if(resultSet.next()){
				myPageDTO.setTotalPrice(resultSet.getString("total_price"));
				myPageDTO.setTotalPrice(resultSet.getString("total_count"));
				myPageDTO.setTotalPrice(resultSet.getString("pay"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			connection.close();
		}
		return myPageDTO;
	}

	//商品履歴削除

public int buyItemHistoryDelete(String item_transaction_id,
		String user_master_id) throws SQLException{

	String sql="DELETE FROM user_buy_item_transaction where item_transaction_id=? AND user_master_id=?";

	PreparedStatement preparedStatement;
	int result=0;

	try{
		preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setString(1,item_transaction_id);
		preparedStatement.setString(2, user_master_id);

		result=preparedStatement.executeUpdate();
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		connection.close();
	}
	return result;
}

public MyPageDTO getMyPageDTO(){
	return myPageDTO;
}

}
