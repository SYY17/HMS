package businesslogic.promotionbl;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import dataservice.promotiondataservice.PromotionDataService;
import po.PromotionPO;

public class PromotionDataService_Driver {

	public void drive(PromotionDataService promotionDataService) throws RemoteException{
		PromotionPO ppo = new PromotionPO(null, null, 0);
		String content = null;
		Date start = null;
		int id=0;
		promotionDataService.init();
		ArrayList <PromotionPO> list = promotionDataService.finds(id);
		if(list != null) System.out.println("All Promotions got!");
		list = promotionDataService.finds(id, start);
		if(list != null) System.out.println("Promotions with certain start time got!");
		list = promotionDataService.finds(id, content);
		if(list != null) System.out.println("Promotions contains certain content got!");
		promotionDataService.insert(ppo);
		promotionDataService.delete(ppo);
		promotionDataService.finish();
	}
}
