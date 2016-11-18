package po;
import java.io.*;
public class RoomPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int hotelID;
	RoomType roomtype;
	//boolean isAvailable;
	int totalSum;
	int remainSum;
	int price;
	
	public RoomPO(int hid,RoomType rt,int ts,int rs,int p){
		hotelID=hid;
		roomtype=rt;
		totalSum=ts;
		remainSum=rs;
		price=p;
	}
	
	public int getHotelID(){
		return hotelID;
	}
	
	public RoomType getRoomType(){
		return roomtype;
	}
	
	public int getTotalSum(){
		return totalSum;
	}
	
	public int getRemainSum(){
		return remainSum;
	}
	
	public int getPrice(){
		return price;
	}
}

enum RoomType{
	SINGLE_ROOM,DOUBLE_ROOM,TRIPLE_ROOM,STANDARD_ROOM,SUPERIOR_ROOM,DELUXE_ROOM,BUSINESS_ROOM,
	SPECIAL_ROOM,TWIN_ROOM,QUEEN_ROOM
}