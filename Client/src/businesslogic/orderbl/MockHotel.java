package businesslogic.orderbl;

import java.util.ArrayList;
import businesslogic.hotelbl.HotelBLService_Stub;
import businesslogicservice.ResultMessage;
import vo.OrderVO;
import vo.RoomVO;

public class MockHotel extends HotelBLService_Stub {
	ArrayList<OrderVO> orderList;

	public MockHotel(int hid,String hn,String ha,String ba,String hd,int sl,int rn,ArrayList<RoomVO> rooms,int r) {
		super(hid, hn, ha, ba, hd, sl, rn, rooms, r);
	}

	public ResultMessage modifyOrderList(int flag, OrderVO orderPO) {
		return ResultMessage.TRUE;
	}

}
