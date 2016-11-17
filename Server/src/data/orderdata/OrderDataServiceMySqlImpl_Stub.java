package data.orderdata;

import java.rmi.RemoteException;
import dataservice.orderdataservice.OrderDataService;
import po.OrderPO;

public class OrderDataServiceMySqlImpl_Stub implements OrderDataService{

	/**
	 * 
	 * @param opo
	 * @throws RemoteException
	 */
	@Override
	public void insert(OrderPO po)  throws RemoteException {
		System.out.println("Insert Succeed!");		
	}

	/**
	 * 
	 * @param opo
	 * @throws RemoteException
	 */
	@Override
	public void delete(OrderPO po)  throws RemoteException {
		System.out.println("Delete Succeed!");	
	}

	/**
	 * 
	 * @param opo
	 * @throws RemoteException
	 */
	@Override
	public void upate(OrderPO po)  throws RemoteException {
		System.out.println("Update Succeed!");	
	}

	/**
	 * 
	 * @param id
	 * @return 根据ID查找并获得的订单信息
	 * @throws RemoteException
	 */
	@Override
	public OrderPO find(int id)  throws RemoteException {
		System.out.println("find Succeed!");
		OrderPO opo=new OrderPO(id, null, id, id, null, null, null, id, id, null);
		return opo;
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void init() throws RemoteException {
		System.out.println("Initialed!");
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void finish() throws RemoteException {
		System.out.println("Finished!");
	}

}
