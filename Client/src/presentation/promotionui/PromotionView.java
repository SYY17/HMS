package presentation.promotionui;

import java.util.Date;
import businesslogic.promotionbl.PromotionBLService_Stub;
import businesslogicservice.promotionblservice.PromotionBLService;

public class PromotionView {
	
	public void stubTest(){
		PromotionBLService promotionBL = new PromotionBLService_Stub("˫ʮһ�����Ż�", new Date(20161111), 2233945);
	}
}
