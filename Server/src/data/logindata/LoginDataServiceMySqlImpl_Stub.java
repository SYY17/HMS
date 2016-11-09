package data.logindata;

import java.rmi.RemoteException;
import dataservice.logindataservice.LoginDataService;
import po.UserPO;

public class LoginDataServiceMySqlImpl_Stub implements LoginDataService{
	int id;
	String name;
	String password;

	/**
	 * 
	 * @param username
	 * @param password
	 * @param id
	 * @throws RemoteException
	 */
	@Override
	public void insert(String username, String password, long id) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert succeed!");
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @param id
	 * @return 根据username,password,ID查找并获得用户信息
	 * @throws RemoteException
	 */
	@Override
	public UserPO find(String username, String password, long id) throws RemoteException {
		// TODO Auto-generated method stub
		UserPO user=new UserPO();
		return user;
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Initialed!");
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Finished!");
	}

}
