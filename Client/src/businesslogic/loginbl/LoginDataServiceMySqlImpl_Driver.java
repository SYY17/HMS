package businesslogic.loginbl;

import java.rmi.RemoteException;
import dataservice.logindataservice.LoginDataService;
import po.UserPO;

public class LoginDataServiceMySqlImpl_Driver {
	
	public void drive(LoginDataService loginDataService) throws RemoteException{
		UserPO upo=new UserPO();
		loginDataService.init();
		loginDataService.insert(null, null, 0);
		upo = loginDataService.find(null, null, 0);
		if(upo!=null) System.out.println("User found!");
		loginDataService.finish();
	}
}
