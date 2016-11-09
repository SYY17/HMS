package data.creditdata;

import java.rmi.RemoteException;
import dataservice.creditdataservice.CreditDataService;
import po.CreditPO;

public class CreditDataServiceMySqlImpl_Stub implements CreditDataService{
	int id = 0;
	int credit = 0;
	
	/**
	 * 
	 * @param cpo
	 * @throws RemoteException
	 */
	@Override
	public void insert(CreditPO cpo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}
	
	/**
	 * 
	 * @param id
	 * @throws RemoteException
	 */
	@Override
	public void delete(int id) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!");
	}
	
	/**
	 * 
	 * @param cpo
	 * @throws RemoteException
	 */
	@Override
	public void update(CreditPO cpo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!");
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
		CreditPO Credit = new CreditPO(id, credit);
		return Credit;
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
