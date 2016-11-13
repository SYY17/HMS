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
	
	public ArrayList<RoomPO> getRooms(){
		return rooms;
	}
}

