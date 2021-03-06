package presentation.orderui;

import java.util.ArrayList;
import java.util.Date;

import businesslogicservice.ResultMessage;
import businesslogicservice.orderblservice.OrderBLService;
import vo.HotelVO;
import vo.OrderStatus;
import vo.OrderVO;
import vo.PromotionVO;
import vo.RoomVO;

public class OrderBLService_Driver {

	public void drive(OrderBLService orderBLService) {
		int orderID = 0;
		OrderStatus orderStatus = null;
		int price = 0;
		int userID = 0;
		Date setTime = null;
		Date checkIn = null;
		Date checkOut = null;
		int roomNumber = 0;
		int hotelID = 0;
		ArrayList<RoomVO> rooms=null;
		OrderVO ovo=new OrderVO(orderID, orderStatus, price, userID, setTime, checkIn, checkOut, roomNumber, hotelID, rooms);
		HotelVO hvo=new HotelVO(userID, null, null, null, null, roomNumber, 0, null, hotelID, null, null);
		PromotionVO pvo=new PromotionVO(null, null, 0);
		
		ArrayList<OrderVO> list=orderBLService.reviewOrder(userID);
		if (list != null) System.out.println("All Orders got!");
		ResultMessage result = orderBLService.cancelOrder(ovo);
		if (result == ResultMessage.TRUE) System.out.println("Order canceled!");
		OrderVO orderVO= orderBLService.create(hvo, userID, pvo);
		if (orderVO != null) System.out.println("Order created!");
		result=orderBLService.addOrder(ovo);
		if (result == ResultMessage.TRUE) System.out.println("Order added!");
		result=orderBLService.complainOrder(ovo);
		if (result == ResultMessage.TRUE) System.out.println("Order complained!");
	}
}
