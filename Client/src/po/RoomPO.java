package po;
import java.io.*;
import vo.RoomType;
public class RoomPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	RoomType roomtype;
	boolean isAvailable;
	int price;
	
	public RoomPO(RoomType rt,boolean ia,int p){
		roomtype=rt;
		isAvailable=ia;
		price=p;
	}
	
	public RoomType getRoomType(){
		return roomtype;
	}
	
	public boolean getState(){
		return isAvailable;
	}
	
	public int getPrice(){
		return price;
	}
}
