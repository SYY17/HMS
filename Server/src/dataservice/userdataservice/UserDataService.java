package dataservice.userdataservice;

import java.rmi.RemoteException;

import po.UserPO;

public interface UserDataService {
	public void insert(UserPO upo) throws RemoteException;
	public void delete(UserPO upo) throws RemoteException;
	public void update(UserPO upo) throws RemoteException;
	public UserPO find(int id) throws RemoteException;
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
}
