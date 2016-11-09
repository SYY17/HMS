package dataservice.logindataservice;

import java.rmi.RemoteException;

import po.UserPO;

public interface LoginDataService {
	public void insert(String username,String password,long id) throws RemoteException;
	public UserPO find(String username,String password,long id) throws RemoteException;
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
}
