package dataservice.logindataservice;

import java.rmi.RemoteException;

import po.UserPO;

public interface LoginDataService {
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @param id
	 * @throws RemoteException
	 */
	public void insert(String username,String password,long id) throws RemoteException;
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @param id
	 * @throws RemoteException
	 * @return 根据 username，password，ID查找并获得用户信息
	 */
	public UserPO find(String username,String password,long id) throws RemoteException;
	
	/**
	 * 
	 *@throws RemoteException
	 */
	public void init() throws RemoteException;
	
	/**
	 * 
	 * @throws RemoteException
	 */
	public void finish() throws RemoteException;
}
