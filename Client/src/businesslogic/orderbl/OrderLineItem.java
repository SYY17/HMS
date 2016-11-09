package businesslogic.orderbl;

import java.util.ArrayList;
import java.util.Date;

import po.OrderPO;
import po.RoomPO;
import vo.RoomVO;

public class OrderLineItem{
	int userID;
	Date setTime;
	Date checkIn;
	Date checkOut;
	int roomNumber;
	int hotelID;
	ArrayList<RoomVO> rooms;

	
	public OrderLineItem(int i,Date s,Date ci,Date co,int rn,int hID,ArrayList<RoomVO> rt){
		userID=i;
		setTime=s;
		checkIn=ci;
		checkOut=co;
		roomNumber=rn;
		hotelID=hID;
		rooms=rt;
	}
	
	public OrderLineItem(OrderPO opo){
		userID=opo.getUserID();
		setTime=opo.getSetTime();
		checkIn=opo.getCheckIn();
		checkOut=opo.getCheckOut();
		roomNumber=opo.getRoomNumber();
		hotelID=opo.getHotelID();
		ArrayList<RoomPO> roomPOList = opo.getRooms();
		rooms=po2vo(roomPOList);
	}
	
	private ArrayList<RoomVO> po2vo(ArrayList<RoomPO> roomPOList){
		ArrayList<RoomVO> roomVOList = new ArrayList<RoomVO>();
		for(RoomPO roomPO : roomPOList){
			roomVOList.add(new RoomVO(roomPO.getRoomType(),roomPO.getState(),roomPO.getPrice()));
		}
		return rooms;
	}
	
	/**
	 * 
	 * @return 获得订单对应用户ID
	 */
	public int getUserID(){
		return userID;
	}
	
	/**
	 * 
	 * @param userID
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	/**
	 * 
	 * @return 获得订单对应下单时间
	 */
	public Date getSetTime(){
		return setTime;
	}
	
	/**
	 * 
	 * @param setTime
	 */
	public void setSetTime(Date setTime) {
		this.setTime = setTime;
	}
	
	/**
	 * 
	 * @return 获得订单对应入住时间
	 */
	public Date getCheckIn(){
		return checkIn;
	}
	
	/**
	 * 
	 * @param checkIn
	 */
	public void setCheckIn(Date checkIn) {
		this.checkIn = checkIn;
	}
	
	/**
	 * 
	 * @return 获得订单对应离开时间
	 */
	public Date getCheckOut(){
		return checkOut;
	}
	
	/**
	 * 
	 * @param checkOut
	 */
	public void setCheckOut(Date checkOut) {
		this.checkOut = checkOut;
	}
	
	/**
	 * 
	 * @return 获得订单对应入住时间
	 */
	public int getRoomNumber(){
		return roomNumber;
	}
	
	/**
	 * 
	 * @param roomNumber
	 */
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	/**
	 * 
	 * @return 获得订单对应酒店ID
	 */
	public int getHotelID(){
		return hotelID;
	}
	
	/**
	 * 
	 * @param hotelID
	 */
	public void setHotelID(int hotelID) {
		this.hotelID = hotelID;
	}
	/**
	 * 
	 * @return 获得订单对应房间列表
	 */
	public ArrayList<RoomVO> getRooms(){
		return rooms;
	}
	
	/**
	 * 
	 * @param rooms
	 */
	public void setRooms(ArrayList<RoomVO> rooms) {
		this.rooms = rooms;
	}
}
