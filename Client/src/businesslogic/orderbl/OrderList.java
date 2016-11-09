package businesslogic.orderbl;

import java.util.ArrayList;

import vo.OrderVO;

public class OrderList {
	ArrayList<OrderLineItem> orderList;

	private OrderLineItem vo2lineitem(OrderVO ovo) {
		OrderLineItem orderLineItem = new OrderLineItem(ovo.getHotelID(), ovo.getSetTime(), ovo.getCheckIn(),
				ovo.getCheckOut(), ovo.getRoomNumber(), ovo.getHotelID(), ovo.getRooms());
		return orderLineItem;
	}

	private OrderVO lineitem2vo(OrderLineItem oderLineItem) {
		OrderVO ovo = new OrderVO(oderLineItem.getHotelID(), oderLineItem.getSetTime(), oderLineItem.getCheckIn(),
				oderLineItem.getCheckOut(), oderLineItem.getRoomNumber(), oderLineItem.getHotelID(),
				oderLineItem.getRooms());
		return ovo;
	}

	/**
	 * 
	 * @param orderList
	 */
	public void setOrderList(ArrayList<OrderLineItem> orderList) {
		this.orderList = orderList;
	}

	/**
	 * 
	 * @return 获得订单列表
	 */
	public ArrayList<OrderLineItem> getOrderList() {
		return orderList;
	}

	/**
	 * 
	 * @param ovo
	 */
	public void addLineItem(OrderVO ovo) {
		orderList.add(vo2lineitem(ovo));
	}

	/**
	 * 
	 * @param ovo
	 */
	public void deleteLineItem(OrderVO ovo) {
		orderList.remove(vo2lineitem(ovo));
	}

	/**
	 * 
	 * @param ovo
	 */
	public void modifyLineItem(OrderVO ovo) {
		orderList.set(orderList.indexOf(vo2lineitem(ovo)), vo2lineitem(ovo));
	}

	/**
	 * 
	 * @param id
	 */
	public OrderVO findLineItem(int id) {
		return lineitem2vo(orderList.get(id));
	}
}
