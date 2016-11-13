package po;

import java.io.*;
import java.util.ArrayList;

public class HotelPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int hotelID;
	String hotelName;
	String hotelAddress;
	String businessArea;
	String hotelDescription;
	int starLevel;
	int roomNumber;
	ArrayList<RoomPO> wholeRooms; 
	int rating;
	
	public HotelPO(int hid,String hn,String ha,String ba,String hd,int sl,int rn,ArrayList<RoomPO> rooms,int r){
		hotelID=hid;
		hotelName=hn;
		hotelAddress=ha;
		businessArea = ba;
		hotelDescription = hd;
		starLevel = sl;
		roomNumber=rn;
		wholeRooms=rooms;
		rating =r;
	}
	
	public int getHotelID(){
		return hotelID;
		
	}
	
	public String getHotelName(){
		return hotelName;
	}
	
	public String getHotelAddress(){
		return hotelAddress;
	}
	
	public String getBusinessArea(){
		return businessArea;
	}
	
	public String getHotelDescription(){
		return hotelDescription;
	}
	
	public int getStarLevel(){
		return starLevel;
	}
	
	public int getRoomNumber(){
		return roomNumber;
	}
	
	public ArrayList<RoomPO> getRooms(){
		return wholeRooms;
	}
	
	public int getRating(){
		return rating;
	}
}
