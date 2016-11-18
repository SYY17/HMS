package businesslogic.hotelbl;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import businesslogicservice.hotelBLService.HotelBLService;
import businesslogictest.hotelbl.MockOrder;
import businesslogictest.hotelbl.MockPromotion;
import vo.HotelVO;
import vo.RoomVO;

public class HotelBLService_Stub implements HotelBLService{
	int hotelID;
	String hotelName;
	String hotelAddress;
	String businessArea;
	String hotelDescription;
	int starLevel;
	int roomNumber;
	ArrayList<RoomVO> wholeRooms;
	int rating;
	MockPromotion mockPromorion;
	MockOrder mockOrder;
	
	public HotelBLService_Stub(){
		
	}
	
	public HotelBLService_Stub (int hid,String hn,String ha,String ba,String hd,int sl,int rn,ArrayList<RoomVO> rooms,int r){
		hotelID=hid;
		hotelName=hn;
		hotelAddress=ha;
		businessArea = ba;
		hotelDescription = hd;
		starLevel = sl;
		roomNumber=rn;
		wholeRooms = rooms;
		rating =r;
	}
	
	/**
	 * 
	 * @param name
	 * @return 浏览酒店信息
	 */
	public ArrayList<HotelVO> reviewHotelInfo(String name){
		ArrayList<HotelVO> hotelInfoList = new ArrayList<HotelVO>();
		//HotelVO vo = new HotelVO(hotelID, businessArea, businessArea, businessArea, businessArea, hotelID, hotelID, roomPrice, businessArea, roomCondition, hotelID);
		//hotelInfoList.add(vo);
		return hotelInfoList;
	}
	
	/**
	 * 
	 * @param 
	 * @return 浏览酒店列表
	 */
	public ArrayList<HotelVO> reviewHotelList(){
		ArrayList<HotelVO> hotelList = new ArrayList<HotelVO>();
		//HotelVO vo = new HotelVO(hotelID, businessArea, businessArea, businessArea, businessArea, hotelID, hotelID, roomPrice, businessArea, roomCondition, hotelID);
		//hotelList.add(vo);
		return hotelList;
	}

	/**
	 * 
	 * @param hvo
	 * @return 创建酒店
	 */
	public ResultMessage createHotel(HotelVO hvo){
		if(hvo != null){
			return ResultMessage.TRUE;
		}
		else return ResultMessage.FALSE;
	}

	/**
	 * 
	 * @param hvo
	 * @return 删除酒店
	 */
	public ResultMessage deleteHotel(HotelVO hvo){
		if(hvo != null){
			return ResultMessage.TRUE;
		}
		else return ResultMessage.FALSE;
	}

	/**
	 * 
	 * @param hvo
	 * @return 修改酒店基本信息
	 */
	public ResultMessage modifyHotel(HotelVO hvo){
		if(hvo != null){
			if((mockPromorion.modifyHotelPrice(0, null) == ResultMessage.TRUE)
					&& (mockOrder.modifyHotelRoomList(0, null) == ResultMessage.TRUE)){
				return ResultMessage.TRUE;
			}else{
				return ResultMessage.FALSE;
			}
			
		}
		else return ResultMessage.FALSE;
	}

	/**
	 * 
	 * @param hvo
	 * @return 评价酒店
	 */
	public ResultMessage gradeHotel(HotelVO hvo){
		if(hvo != null){
			return ResultMessage.TRUE;
		}
		else return ResultMessage.FALSE;
	}

	/**
	 * 
	 * @param name
	 * @return 按酒店名称搜索酒店基本信息
	 */
	public ArrayList<HotelVO> searchHotel(String name){
		ArrayList<HotelVO> hotelInfoList = new ArrayList<HotelVO>();
		return hotelInfoList;
	}

	/**
	 * 
	 * @param type
	 * @return 按类型搜索房间
	 */
	public ArrayList<RoomVO> searchRoom(String type){
		ArrayList<RoomVO> RoomInfoList = new ArrayList<RoomVO>();
		return RoomInfoList;
	}
	
}
