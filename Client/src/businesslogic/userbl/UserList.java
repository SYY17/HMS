package businesslogic.userbl;

import java.util.ArrayList;

public class UserList {
	ArrayList<UserLineItem> userList;
	
	public void setUserList(ArrayList<UserLineItem> uli){
		userList=uli;
	}
	
	public ArrayList<UserLineItem> getUserList(){
		return userList;
	}
	
	
}
