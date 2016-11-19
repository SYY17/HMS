package data.datafactory;

import data.creditdata.CreditDataServiceMySqlImpl;
import data.hoteldata.HotelDataServiceMySqlImpl_Stub;
import data.orderdata.OrderDataServiceMySqlImpl_Stub;
import data.promotiondata.PromotionDataServiceMySqlImpl;
import data.userdata.UserDataServiceMySqlImpl_Stub;
import dataservice.creditdataservice.CreditDataService;
import dataservice.datafactoryservice.DataBaseFactory;
import dataservice.hoteldataservice.HotelDataService;
import dataservice.orderdataservice.OrderDataService;
import dataservice.promotiondataservice.PromotionDataService;
import dataservice.userdataservice.UserDataService;

public class DataBaseFactoryMySqlImpl_Stub implements DataBaseFactory{
	
	/**
	 * 
	 * @return 获得用户数据
	 */
	@Override
	public UserDataService getUserData() {
		// TODO Auto-generated method stub
		UserDataService userData = new UserDataServiceMySqlImpl_Stub();
		return userData;
	}
	
	/**
	 * 
	 * @return 获得订单数据
	 */
	@Override
	public OrderDataService getOrderData() {
		OrderDataService orderData=new OrderDataServiceMySqlImpl_Stub();
		return orderData;
	}
	
	/**
	 * 
	 * @return 获得酒店数据
	 */
	@Override
	public HotelDataService getHotelData() {
		// TODO Auto-generated method stub
		HotelDataService hotelData = new HotelDataServiceMySqlImpl_Stub();
		return hotelData;
	}
	
	/**
	 * 
	 * @return 获得营销策略数据
	 */
	@Override
	public PromotionDataService getPromotionData() {
		// TODO Auto-generated method stub
		PromotionDataService promotionData = new PromotionDataServiceMySqlImpl();
		return promotionData;
	}

	/**
	 * 
	 * @return 获得信用值数据
	 */
	@Override
	public CreditDataService getCreditData() {
		// TODO Auto-generated method stub
		CreditDataService creditData = new CreditDataServiceMySqlImpl();
		return creditData;
	}
}
