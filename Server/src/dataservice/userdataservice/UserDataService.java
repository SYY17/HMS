package dataservice.userdataservice;

import java.rmi.RemoteException;

import po.UserPO;

public interface UserDataService {
	
	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	public void insert(UserPO upo) throws RemoteException;
	
	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	public void delete(UserPO upo) throws RemoteException;
	
	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	public void update(UserPO upo) throws RemoteException;
	
	/**
	 * 
	 * @param id
	 * @return 根据ID查找并返回用户信息
	 * @throws RemoteException
	 */
	public UserPO find(int id) throws RemoteException;
	
	/**
	 * 
	 * @throws RemoteException
	 */
	public void init() throws RemoteException;
	
	/**
	 * 
	 * @throws RemoteException
	 */
	public void finish() throws RemoteException;
}
