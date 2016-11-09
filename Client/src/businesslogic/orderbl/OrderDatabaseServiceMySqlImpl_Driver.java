package businesslogic.orderbl;

import java.rmi.RemoteException;
import dataservice.orderdataservice.OrderDataService;
import po.OrderPO;

public class OrderDatabaseServiceMySqlImpl_Driver {
	public void drive(OrderDataService orderDatabaseService) throws RemoteException {
		OrderPO opo = new OrderPO(0, null, null, null, 0, 0, null);
		orderDatabaseService.init();
		orderDatabaseService.finish();
		orderDatabaseService.delete(opo);
		OrderPO orderPO = orderDatabaseService.find(0);
		if (orderPO != null) {
			System.out.println("Order got!");
		}
		orderDatabaseService.insert(opo);
		orderDatabaseService.upate(opo);
	}
}
