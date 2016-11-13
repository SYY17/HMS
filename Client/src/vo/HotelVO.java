package vo;

import java.io.*;
import java.util.*;
public class HotelVO implements Serializable{
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
	ArrayList<RoomVO> wholeRooms; 
	int rating;
	
	public HotelVO(int hid,String hn,String ha,String ba,String hd,int sl,int rn,ArrayList<RoomVO> rooms,int r){
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
	
	public ArrayList<RoomVO> getRooms(){
		return wholeRooms;
	}
	
	public int getRating(){
		return rating;
	}
}
