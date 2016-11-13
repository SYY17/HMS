package businesslogictest.hotelbl;

import java.util.ArrayList;
import java.util.Date;
import businesslogic.orderbl.OrderBLService_Stub;
import businesslogicservice.ResultMessage;
import vo.HotelVO;
import vo.RoomVO;

public class MockOrder extends OrderBLService_Stub {
	int credit;
	ArrayList<HotelVO> hotelList;

	public MockOrder(int userID, Date setTime, Date checkIn, Date checkOut, int roomNumber, int hotelID, ArrayList<RoomVO> rooms) {
		super(userID, setTime, checkIn, checkOut, roomNumber, hotelID, rooms);
	}

	public ResultMessage modifyHotelRoomList(int flag, HotelVO hotelVO) {
		return ResultMessage.TRUE;
	}
	
}