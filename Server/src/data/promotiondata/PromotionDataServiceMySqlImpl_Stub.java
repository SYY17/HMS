package data.promotiondata;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import dataservice.promotiondataservice.PromotionDataService;
import po.PromotionPO;

public class PromotionDataServiceMySqlImpl_Stub implements PromotionDataService{
	String content = "";
	Date start = null;
	int id = 0;
	
	/**
	 * 
	 * @return 根据ID查找并返回所有营销策略信息
	 * @throws RemoteException
	 */
	@Override
	public ArrayList <PromotionPO> finds(int id) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList <PromotionPO> list = new ArrayList<>();
		PromotionPO promotion = new PromotionPO(content, start, id);
		list.add(promotion);
		return list;
	}
	
	/**
	 * 
	 * @param start
	 * @return 根据ID和起始时间查找并返回营销策略信息
	 * @throws RemoteException
	 */
	@Override
	public ArrayList <PromotionPO> finds(int id, Date start) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList <PromotionPO> list = new ArrayList<>();
		PromotionPO promotion = new PromotionPO(content, start, id);
		list.add(promotion);
		return list;
	}

	/**
	 * 
	 * @param id
	 * @param content
	 * @return 根据ID和内容查找并返回营销策略信息
	 * @throws RemoteException
	 */
	@Override
	public ArrayList <PromotionPO> finds(int id, String content) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList <PromotionPO> list = new ArrayList<>();
		PromotionPO promotion = new PromotionPO(content, start, id);
		list.add(promotion);
		return list;
	}

	/**
	 * 
	 * @param ppo
	 * @throws RemoteException
	 */
	@Override
	public void insert(PromotionPO ppo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeed!");
	}

	/**
	 * 
	 * @param ppo
	 * @throws RemoteException
	 */
	@Override
	public void delete(PromotionPO ppo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeed!");
	}

	/**
	 * 
	 * @param ppo
	 * @throws RemoteException
	 */
	@Override
	public void update(PromotionPO ppo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeed!");
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Initialed!");
		
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Finished!");
	}

}
