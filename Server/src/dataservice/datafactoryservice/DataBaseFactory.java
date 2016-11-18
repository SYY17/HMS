package dataservice.datafactoryservice;

import dataservice.creditdataservice.CreditDataService;
import dataservice.hoteldataservice.HotelDataService;
import dataservice.orderdataservice.OrderDataService;
import dataservice.promotiondataservice.PromotionDataService;
import dataservice.userdataservice.UserDataService;

public interface DataBaseFactory {
	
	/**
	 * 
	 * @return 获得用户数据
	 */
	public UserDataService getUserData();
	
	/**
	 * 
	 * @return 获得订单数据
	 */
	public OrderDataService getOrderData();
	
	/**
	 * 
	 * @return 获得酒店数据
	 */
	public HotelDataService getHotelData();
	
	/**
	 * 
	 * @return 获得营销策略数据
	 */
	public PromotionDataService getPromotionData();
	
	/**
	 * 
	 * @return 获得信用值数据
	 */
	public CreditDataService getCreditData();
}
