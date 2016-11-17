package vo;
import java.io.*;
import java.util.*;
public class OrderVO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	int orderID;
//	OrderStatus orderStatus;
//	int price;
	int userID;
	Date setTime;
	Date checkIn;
	Date checkOut;
	int roomNumber;
	int hotelID;
	ArrayList<RoomVO> rooms;
	
	public OrderVO(int i,Date s,Date ci,Date co,int rn,int hID,ArrayList<RoomVO> rt){
		userID=i;
		setTime=s;
		checkIn=ci;
		checkOut=co;
		roomNumber=rn;
		hotelID=hID;
		rooms=rt;
	}
	
	public int getUserID(){
		return userID;
	}
	
	public Date getSetTime(){
		return setTime;
	}
	
	public Date getCheckInTime(){
		return checkIn;
	}
	
	public Date getCheckOutTime(){
		return checkOut;
	}
	
	public int getRoomNumber(){
		return roomNumber;
	}
	
	public int getHotelID(){
		return hotelID;
	}
	
	public ArrayList<RoomVO> getRooms(){
		return rooms;
	}
}

