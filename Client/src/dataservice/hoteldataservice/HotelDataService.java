package dataservice.hoteldataservice;

import java.rmi.RemoteException;
import java.util.ArrayList;

import po.HotelPO;

public interface HotelDataService {
	public void delete(HotelPO hpo) throws RemoteException; 
	public void insert(HotelPO hpo) throws RemoteException;
	public void update(HotelPO hpo) throws RemoteException;
	public HotelPO find(String name) throws RemoteException;
	public ArrayList<HotelPO> finds(String field,String value) throws RemoteException;
	public ArrayList<HotelPO> finds() throws RemoteException;
	public void init() throws RemoteException;
	public void finish() throws RemoteException;
}
