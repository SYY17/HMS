package data.userdata;

import java.rmi.RemoteException;
import dataservice.userdataservice.UserDataService;
import po.UserPO;

public class UserDataServiceMySqlImpl_Stub implements UserDataService{
	int id;
	String name;
	String password;

	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	@Override
	public void insert(UserPO upo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert suceed!");
	}

	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	@Override
	public void delete(UserPO upo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete succeed!");
	}

	/**
	 * 
	 * @param upo
	 * @throws RemoteException
	 */
	@Override
	public void update(UserPO upo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Updat succeed!");
	}

	/**
	 * 
	 * @param id
	 * @return 根据ID查找并获得用户信息
	 * @throws RemoteException
	 */
	@Override
	public UserPO find(int id) throws RemoteException {
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
		System.out.println("Initialize succeed!");
	}

	/**
	 *
	 * @throws RemoteException
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Finish succeed!");
	}

}
