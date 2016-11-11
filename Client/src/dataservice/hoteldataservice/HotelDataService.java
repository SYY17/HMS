package dataservice.hoteldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.HotelPO;

public interface HotelDataService {
	
	/**
	 * 
	 * @param hpo
	 * @throws RemoteException
	 */
	public void delete(HotelPO hpo) throws RemoteException; 
	
	/**
	 * 
	 * @param hpo
	 * @throws RemoteException
	 */
	public void insert(HotelPO hpo) throws RemoteException;
	
	/**
	 * 
	 * @param hpo
	 * @throws RemoteException
	 */
	public void update(HotelPO hpo) throws RemoteException;
	
	/**
	 * 
	 * @param name
	 * @return 根据名称查找酒店
	 * @throws RemoteException
	 */
	public HotelPO find(String name) throws RemoteException;
	
	/**
	 * 
	 * @param field
	 * @param value
	 * @return 根据范围和值查找酒店
	 * @throws RemoteException
	 */
	public ArrayList<HotelPO> finds(String field,String value) throws RemoteException;
	
	/**
	 * 
	 * @return 浏览所有酒店的列表
	 * @throws RemoteException
	 */
	public ArrayList<HotelPO> finds() throws RemoteException;
	
	/**
	 * 
	 * @throws RemoteException
	 */
	public void init() throws RemoteException;
	
	/**
	 * 
	 * @throws RemoteException
	 */
	public void finish() throws RemoteException;
}
