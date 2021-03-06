package businesslogicservice.hotelBLService;

import java.util.ArrayList;
import businesslogicservice.ResultMessage;
import vo.HotelVO;
import vo.RoomVO;

public interface HotelBLService{
	
	/**
	 * 
	 * @param name
	 * @return 浏览酒店信息
	 */
	public ArrayList<HotelVO> reviewHotelInfo(String name);
	
	/**
	 * 
	 * @param 
	 * @return 浏览酒店列表
	 */
	public ArrayList<HotelVO> reviewHotelList();
	
	/**
	 * 
	 * @param hvo
	 * @return 创建酒店
	 */
	public ResultMessage createHotel(HotelVO hvo);
	
	/**
	 * 
	 * @param hvo
	 * @return 删除酒店
	 */
	public ResultMessage deleteHotel(HotelVO hvo);
	
	/**
	 * 
	 * @param hvo
	 * @return 修改酒店基本信息
	 */
	public ResultMessage modifyHotel(HotelVO hvo);
	
	/**
	 * 
	 * @param hvo
	 * @return 评价酒店
	 */
	public ResultMessage gradeHotel(HotelVO hvo);
	
	/**
	 * 
	 * @param name
	 * @return 按酒店名称搜索酒店基本信息
	 */
	public ArrayList<HotelVO> searchHotel(String name);
	
	/**
	 * 
	 * @param type
	 * @return 按类型搜索房间
	 */
	public ArrayList<RoomVO> searchRoom(String type);
	
}
