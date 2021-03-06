package presentation.controller;
import java.util.ArrayList;

import businesslogic.hotelbl.HotelBLService_Stub;
import businesslogicservice.ResultMessage;
import businesslogicservice.hotelBLService.HotelBLService;
import presentation.hotelui.HotelControllerService;
import vo.HotelVO;
import vo.RoomVO;

public class HotelControllerImpl implements HotelControllerService{
	int hotelID;
	String hotelName;
	String hotelAddress;
	String businessArea;
	String hotelDescription;
	int starLevel;
	int roomNumber;
	ArrayList<RoomVO> wholeRooms;
	int rating;
	String staffName;
	String phoneNumber;
	
	private HotelBLService hotelBLService;
	
	public HotelControllerImpl(int hid,String hn,String ha,String ba,String hd,int sl,int rn,ArrayList<RoomVO> rooms,int r,String sn,String pn){
		hotelID=hid;
		hotelName=hn;
		hotelAddress=ha;
		businessArea = ba;
		hotelDescription = hd;
		starLevel = sl;
		roomNumber=rn;
		wholeRooms = rooms;
		rating =r;
		staffName = sn;
		phoneNumber = pn;
		
		hotelBLService = new HotelBLService_Stub(hotelID,hotelName,hotelAddress,businessArea,hotelDescription,starLevel,roomNumber,wholeRooms,rating,staffName,phoneNumber);
	}
	
	/**
	 * 浏览酒店信息
	 * @param name
	 * @return hotelInfoList
	 */
	@Override
	public ArrayList<HotelVO> reviewHotelInfo(String name) {
		// TODO Auto-generated method stub
		return hotelBLService.reviewHotelInfo(name);
	}

	/**
	 * 浏览酒店列表
	 * @param 
	 * @return hotelList
	 */
	@Override
	public ArrayList<HotelVO> reviewHotelList() {
		// TODO Auto-generated method stub
		return hotelBLService.reviewHotelList();
	}

	/**
	 * 创建酒店
	 * @param hvo
	 * @return ResultMessage
	 */
	@Override
	public ResultMessage createHotel(HotelVO hvo) {
		// TODO Auto-generated method stub
		return hotelBLService.createHotel(hvo);
	}

	/**
	 * 删除酒店
	 * @param hvo
	 * @return ResultMessage
	 */
	@Override
	public ResultMessage deleteHotel(HotelVO hvo) {
		// TODO Auto-generated method stub
		return hotelBLService.deleteHotel(hvo);
	}

	/**
	 * 修改酒店基本信息
	 * @param hvo
	 * @return ResultMessage
	 */
	@Override
	public ResultMessage modifyHotel(HotelVO hvo) {
		// TODO Auto-generated method stub
		return hotelBLService.modifyHotel(hvo);
	}

	/**
	 * 评价酒店
	 * @param hvo
	 * @return ResultMessage
	 */
	@Override
	public ResultMessage gradeHotel(HotelVO hvo) {
		// TODO Auto-generated method stub
		return hotelBLService.gradeHotel(hvo);
	}

	/**
	 * 按酒店名称搜索酒店基本信息
	 * @param name
	 * @return hotelInfoList
	 */
	@Override
	public ArrayList<HotelVO> searchHotel(String name) {
		// TODO Auto-generated method stub
		return hotelBLService.searchHotel(name);
	}

	/**
	 * 按类型搜索房间
	 * @param type
	 * @return RoomInfoList
	 */
	@Override
	public ArrayList<RoomVO> searchRoom(String type) {
		// TODO Auto-generated method stub
		return hotelBLService.searchRoom(type);
	}

}
