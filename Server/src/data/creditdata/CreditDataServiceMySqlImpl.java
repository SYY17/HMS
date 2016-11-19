package data.creditdata;

import java.rmi.RemoteException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dataservice.creditdataservice.CreditDataService;
import po.CreditPO;

public class CreditDataServiceMySqlImpl implements CreditDataService{

	Connection connect;
	PreparedStatement statement;
	ResultSet result;
	
	/**
	 * 
	 * @param cpo
	 * @throws RemoteException
	 */
	@Override
	public void insert(CreditPO cpo) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			//为防止重复插入信息应进行检查
			if(find(cpo.getID()) != null) return;
			
			//列：id; credit
			statement = connect.prepareStatement("insert into credit values(?, ?)");
			
			statement.setString(1, String.valueOf(cpo.getID()));
			statement.setString(2, String.valueOf(cpo.getCredit()));
			
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/**
	 * 
	 * @param id
	 * @throws RemoteException
	 */
	@Override
	public void delete(int id) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			//列：id; credit
			statement = connect.prepareStatement("delete from credit where id = ?");
			statement.setString(1, String.valueOf(id));
			
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param cpo
	 * @throws RemoteException
	 */
	@Override
	public void update(CreditPO cpo) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			//列：id; credit
			statement = connect.prepareStatement("update credit set id = ?, credit = ? where id = ?");
			statement.setString(1, String.valueOf(cpo.getID()));
			statement.setString(2, String.valueOf(cpo.getCredit()));
			statement.setString(3, String.valueOf(cpo.getID()));
			
			statement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @param id
	 * @return 根据ID查找并获得信用值信息
	 * @throws RemoteException
	 */
	@Override
	public CreditPO find(int id) throws RemoteException {
		// TODO Auto-generated method stub
		try {
			statement = connect.prepareStatement("select * from credit where id = ?");
			
			//列：id, credit
			statement.setString(1, String.valueOf(id));
			
			result = statement.executeQuery();
			
			//CreditPO: id; credit
			int credit = -1;
			
			//遍历result
			while(result.next()){
				credit = Integer.valueOf(result.getString(2));
			}
			
			if(credit != -1){
				return new CreditPO(id, credit);
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
