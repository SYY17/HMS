package businesslogic.orderbl;

import java.util.ArrayList;

import businesslogicservice.ResultMessage;
import businesslogicservice.orderblservice.OrderBLService;
import vo.HotelVO;
import vo.OrderVO;
import vo.PromotionVO;

public class OrderController implements OrderBLService{

	/**
	 * 
	 * @param id
	 * @return 浏览全部订单
	 */
	@Override
	public ArrayList<OrderVO> reviewOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param id
	 * @return 浏览异常订单
	 */
	@Override
	public ArrayList<OrderVO> reviewAbnormalOrder(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param ovo
	 * @return 取消订单
	 */
	@Override
	public ResultMessage cancelOrder(OrderVO ovo) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param hvo
	 * @param id
	 * @param pvo
	 * @return 创建订单
	 */
	@Override
	public OrderVO create(HotelVO hvo, int id, PromotionVO pvo) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param ovo
	 * @return 增加订单
	 */
	@Override
	public ResultMessage addOrder(OrderVO ovo) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 
	 * @param cvo
	 * @param id
	 * @return 处理异常订单
	 */
	@Override
	public ResultMessage complainOrder(OrderVO ovo) {
		// TODO Auto-generated method stub
		return null;
	}

}
