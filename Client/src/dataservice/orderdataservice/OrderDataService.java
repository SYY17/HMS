package dataservice.orderdataservice;

import java.rmi.RemoteException;
import po.OrderPO;

public interface OrderDataService {
	
	/**
	 * 
	 * @param opo
	 * @throws RemoteException
	 */
	public void insert(OrderPO opo) throws RemoteException;

	/**
	 * 
	 * @param opo
	 * @throws RemoteException
	 */
	public void delete(OrderPO opo) throws RemoteException;

	/**
	 * 
	 * @param opo
	 * @throws RemoteException
	 */
	public void upate(OrderPO opo) throws RemoteException;

	/**
	 * 
	 * @param id
	 * @return 根据ID查找并获得的订单信息
	 * @throws RemoteException
	 */
	public OrderPO find(int id) throws RemoteException;

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
