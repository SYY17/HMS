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
	
	/**
	 * 
	 * @return 获得酒店ID
	 */
	public int getHotelID(){
		return hotelID;
		
	}
	
	/**
	 * 
	 * @return 获得酒店名称
	 */
	public String getHotelName(){
		return hotelName;
	}
	
	/**
	 * 
	 * @return 获得酒店地址
	 */
	public String getHotelAddress(){
		return hotelAddress;
	}
	
	/**
	 * 
	 * @return 获得酒店商圈
	 */
	public String getBusinessArea(){
		return businessArea;
	}
	
	/**
	 * 
	 * @return 获得酒店简介
	 */
	public String getHotelDescription(){
		return hotelDescription;
	}
	
	/**
	 * 
	 * @return 获得酒店星级
	 */
	public int getStarLevel(){
		return starLevel;
	}
	
	/**
	 * 
	 * @return 获得房间号
	 */
	public int getRoomNumber(){
		return roomNumber;
	}
	
	/**
	 * 
	 * @return 获得酒店房间列表
	 */
	public ArrayList<RoomVO> getRooms(){
		return wholeRooms;
	}
	
	/**
	 * 
	 * @return 获得酒店评级
	 */
	public int getRating(){
		return rating;
	}
}
