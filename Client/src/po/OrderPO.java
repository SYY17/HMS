package po;
import java.io.*;
import java.util.*;
public class OrderPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int userID;
	Date setTime;
	Date checkIn;
	Date checkOut;
	int roomNumber;
	int hotelID;
	ArrayList<RoomPO> rooms;

	
	public OrderPO(int i,Date s,Date ci,Date co,int rn,int hID,ArrayList<RoomPO> rt){
		userID=i;
		setTime=s;
		checkIn=ci;
		checkOut=co;
		roomNumber=rn;
		hotelID=hID;
		rooms=rt;
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
	 * @return 获得订单对应下单时间
	 */
	public Date getSetTime(){
		return setTime;
	}
	
	/**
	 * 
	 * @return 获得订单对应入住时间
	 */
	public Date getCheckInTime(){
		return checkIn;
	}
	
	/**
	 * 
	 * @return 获得订单对应离开时间
	 */
	public Date getCheckOutTime(){
		return checkOut;
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
	 * @return 获得订单对应酒店ID
	 */
	public int getHotelID(){
		return hotelID;
	}
	
	/**
	 * 
	 * @return 获得订单对应房间列表
	 */
	public ArrayList<RoomPO> getRooms(){
		return rooms;
	}
}

