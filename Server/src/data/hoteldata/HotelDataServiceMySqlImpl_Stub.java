package data.hoteldata;

import java.rmi.RemoteException;
import java.util.ArrayList;
import dataservice.hoteldataservice.HotelDataService;
import po.HotelPO;

public class HotelDataServiceMySqlImpl_Stub implements HotelDataService{

	/**
	 * 
	 * @param hpo
	 * @throws RemoteException
	 */
	@Override
	public void delete(HotelPO hpo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Delete Succeeded!");
	}

	/**
	 * 
	 * @param hpo
	 * @throws RemoteException
	 */
	@Override
	public void insert(HotelPO hpo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Insert Succeeded!");
	}

	/**
	 * 
	 * @param hpo
	 * @throws RemoteException
	 */
	@Override
	public void update(HotelPO hpo) throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Update Succeeded!");
	}

	/**
	 * 
	 * @param name
	 * @return 根据名称查找酒店
	 * @throws RemoteException
	 */
	@Override
	public HotelPO find(String name) throws RemoteException {
		// TODO Auto-generated method stub
		HotelPO hotel = new HotelPO(0, name, null, null, null, 0, 0, null, 0);
		return hotel;
	}

	/**
	 * 
	 * @param field
	 * @param value
	 * @return 根据范围和值查找酒店
	 * @throws RemoteException
	 */
	@Override
	public ArrayList<HotelPO> finds(String field, String value) throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<HotelPO> hotelList = new ArrayList<HotelPO>();
		return hotelList;
	}

	/**
	 * 
	 * @return 浏览所有酒店的列表
	 * @throws RemoteException
	 */
	@Override
	public ArrayList<HotelPO> finds() throws RemoteException {
		// TODO Auto-generated method stub
		ArrayList<HotelPO> hotelList = new ArrayList<HotelPO>();
		return hotelList;
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void init() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Initialed!");
	}

	/**
	 * 
	 * @throws RemoteException
	 */
	@Override
	public void finish() throws RemoteException {
		// TODO Auto-generated method stub
		System.out.println("Finished!");
	}
}
