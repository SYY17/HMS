package businesslogic.hotelbl;

import java.util.ArrayList;

public class HotelList {

	ArrayList<HotelLineItem> list;
	
	/**
	 * 
	 * @param list
	 */
	public void setHotelList(ArrayList<HotelLineItem> list){
		this.list = list;
	}
	
	/**
	 * 
	 * @return 获得酒店列表
	 */
	public ArrayList<HotelLineItem> getHotelList(){
		return list;
	}
	
	/**
	 * 
	 * @param hotelLineItem
	 */
	public void addHotelList(HotelLineItem hotelLineItem){
		list.add(hotelLineItem);
	}
	
	/**
	 * 
	 * @param id
	 */
	public void deleteHotelList(int id){
		list.remove(id);
	}
	
	/**
	 * 
	 * @param hotelLineItem
	 * @param id
	 */
	public void modifyHotelList(HotelLineItem hotelLineItem, int id){
		list.set(id, hotelLineItem);
	}
	
	/**
	 * 
	 * @param id
	 */
	public void find(int id){
		list.get(id);
	}
}
