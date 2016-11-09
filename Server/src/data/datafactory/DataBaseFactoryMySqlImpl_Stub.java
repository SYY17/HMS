package data.datafactory;

import data.creditdata.CreditDataServiceMySqlImpl_Stub;
import data.hoteldata.HotelDataServiceMySqlImpl_Stub;
import data.orderdata.OrderDataServiceMySqlImpl_Stub;
import data.promotiondata.PromotionDataServiceMySqlImpl_Stub;
import data.userdata.UserDataServiceMySqlImpl_Stub;
import dataservice.creditdataservice.CreditDataService;
import dataservice.datafactoryservice.DataBaseFactory;
import dataservice.hoteldataservice.HotelDataService;
import dataservice.orderdataservice.OrderDataService;
import dataservice.promotiondataservice.PromotionDataService;
import dataservice.userdataservice.UserDataService;

public class DataBaseFactoryMySqlImpl_Stub implements DataBaseFactory{
	//³éÏó¹¤³§
	@Override
	public HotelDataService getHotelData() {
		// TODO Auto-generated method stub
		HotelDataService hotelData = new HotelDataServiceMySqlImpl_Stub();
		return hotelData;
	}
	
	@Override
	public PromotionDataService getPromotionData() {
		// TODO Auto-generated method stub
		PromotionDataService promotionData = new PromotionDataServiceMySqlImpl_Stub();
		return promotionData;
	}

	@Override
	public CreditDataService getCreditData() {
		// TODO Auto-generated method stub
		CreditDataService creditData = new CreditDataServiceMySqlImpl_Stub();
		return creditData;
	}

	@Override
	public UserDataService getUserData() {
		// TODO Auto-generated method stub
		UserDataService userData = new UserDataServiceMySqlImpl_Stub();
		return userData;
	}
	
	@Override
	public OrderDataService getOrderData() {
		OrderDataService orderData=new OrderDataServiceMySqlImpl_Stub();
		return orderData;
	}
}
