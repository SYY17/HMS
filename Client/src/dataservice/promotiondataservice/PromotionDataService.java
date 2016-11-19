package dataservice.promotiondataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;
import po.PromotionPO;

public interface PromotionDataService {
	
	/**
	 * 
	 * @return 根据ID查找并返回所有营销策略信息
	 * @throws RemoteException
	 */
	public ArrayList <PromotionPO> finds(int id) throws RemoteException;
	
	/**
	 * 
	 * @param start
	 * @return 根据ID和起始时间查找并返回营销策略信息
	 * @throws RemoteException
	 */
	public ArrayList <PromotionPO> finds(int id, Date start) throws RemoteException;
	
	/**
	 * 
	 * @param id
	 * @param content
	 * @return 根据ID和内容查找并返回营销策略信息
	 * @throws RemoteException
	 */
	public ArrayList <PromotionPO> finds(int id, String content) throws RemoteException;
	
	/**
	 * 
	 * @param ppo
	 * @throws RemoteException
	 */
	public void insert(PromotionPO ppo) throws RemoteException;
	
	/**
	 * 
	 * @param ppo
	 * @throws RemoteException
	 */
	public void delete(PromotionPO ppo) throws RemoteException;
	
	/**
	 * 
	 * @throws RemoteException
	 */
	public void init() throws RemoteException;
	
	/**
	 * 
	 * @throws RemoteException
	 */
	public void finish() throws RemoteException;
}
