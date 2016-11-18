package data.userdata;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataservice.userdataservice.UserDataService;
import po.UserPO;

public class UserDataServiceMySqlImpl implements UserDataService{

	Connection connect;
	PreparedStatement statement;
	ResultSet result;
	
	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	@Override
	public void insert(UserPO upo) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			//为防止重复插入信息应进行检查
			if(find(upo.getID()) != null) return;
			
			//列：id; username; password
			statement = connect.prepareStatement("insert into user values(?, ?, ?)");
			
			statement.setString(1, String.valueOf(upo.getID()));
			statement.setString(2, upo.getName());
			statement.setString(3, upo.getPassword());
			
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	@Override
	public void delete(UserPO upo) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			//列：id; username; password
			statement = connect.prepareStatement("delete from user where id = ?");
			statement.setString(1, String.valueOf(upo.getID()));
			
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	@Override
	public void update(UserPO upo) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			//列：id; username; password
			statement = connect.prepareStatement("update user set id = ?, username = ?, password = ? where id = ?");
			statement.setString(1, String.valueOf(upo.getID()));
			statement.setString(2, upo.getName());
			statement.setString(3, upo.getPassword());
			statement.setString(4, String.valueOf(upo.getID()));
			
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param id
	 * @return 根据ID查找并返回用户信息
	 * @throws RemoteException
	 */
	@Override
	public UserPO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			statement = connect.prepareStatement("select * from user where id = ?");
			
			//列：id; username; password
			statement.setString(1, String.valueOf(id));
			
			result = statement.executeQuery();
			
			//CreditPO: id; credit
			String username = "";
			String password = "";
			
			//遍历result
			while(result.next()){
				username = result.getString(2);
				password = result.getString(3);
			}
			
			if(username != ""){
				return new UserPO(id, username, password);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_management_system", "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			statement.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try{
			if(result != null){
				result.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
