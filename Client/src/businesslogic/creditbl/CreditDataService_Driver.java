package businesslogic.creditbl;

import java.rmi.RemoteException;
import dataservice.creditdataservice.CreditDataService;
import po.CreditPO;

public class CreditDataService_Driver {
	
	public void drive(CreditDataService creditDataService) throws RemoteException{
		CreditPO cpo = new CreditPO(0, 0);
		int id = 0;
		creditDataService.init();
		creditDataService.insert(cpo);
		creditDataService.delete(id);
		creditDataService.update(cpo);
		cpo = creditDataService.find(id);
		if(cpo != null) System.out.println("Credit found!");
		creditDataService.finish();
	}
}
