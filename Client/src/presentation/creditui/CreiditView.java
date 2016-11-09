package presentation.creditui;

import businesslogic.creditbl.CreditBLService_Stub;
import businesslogicservice.creditBLService.CreditBLService;

public class CreiditView {
	
	public void stubTest(){
		CreditBLService creditBL = new CreditBLService_Stub(1016030, 500);
	}
}
