package businesslogic.userbl;

import java.rmi.RemoteException;
import dataservice.userdataservice.UserDataService;
import po.UserPO;

public class UserDataServiceMySqlImpl_Driver {
	
	public void drive(UserDataService userDataService) throws RemoteException{
		UserPO upo=new UserPO();
		int id=0;
		userDataService.init();
		userDataService.insert(upo);
		userDataService.update(upo);
		upo = userDataService.find(id);
		if(upo!=null) System.out.println("User found.");
		userDataService.delete(upo);
		userDataService.finish();
	}
}
