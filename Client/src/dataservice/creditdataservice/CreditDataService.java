package dataservice.creditdataservice;

import java.rmi.RemoteException;

import po.CreditPO;

public interface CreditDataService {
	
	/**
	 * 
	 * @param cpo
	 * @throws RemoteException
	 */
	public void insert(CreditPO cpo) throws RemoteException;
	
	/**
	 * 
	 * @param id
	 * @throws RemoteException
	 */
	public void delete(int id) throws RemoteException;
	
	/**
	 * 
	 * @param cpo
	 * @throws RemoteException
	 */
	public void update(CreditPO cpo) throws RemoteException;
	
	/**
	 * 
	 * @param id
	 * @return 根据ID查找并获得信用值信息
	 * @throws RemoteException
	 */
	public CreditPO find(int id) throws RemoteException;
	
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
