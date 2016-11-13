package businesslogic.orderbl;

import java.util.ArrayList;

public class OrderList {
	ArrayList<OrderLineItem> orderList;

	/**
	 * 
	 * @return 获得订单列表
	 */
	public void setOrderList(ArrayList<OrderLineItem> orderList) {
		this.orderList = orderList;
	}

	/**
	 * 
	 */
	public ArrayList<OrderLineItem> getOrderList() {
		return orderList;
	}

	public void add(OrderLineItem orderLineItem) {
		orderList.add(orderLineItem);
	}

	public void delete(int id) {
		orderList.remove(id);
	}

	public void modify(OrderLineItem orderLineItem, int id) {
		orderList.set(id, orderLineItem);
	}

	public void find(int id) {
		orderList.get(id);
	}
}
