package dataservice.orderdataservice;

import java.rmi.RemoteException;

import po.OrderPO;

public interface OrderDataService {
	public void insert(OrderPO po) throws RemoteException;

	public void delete(OrderPO po) throws RemoteException;

	public void upate(OrderPO po) throws RemoteException;

	public OrderPO find(int id) throws RemoteException;

	public void init() throws RemoteException;

	public void finish() throws RemoteException;
}
