package po;
import java.io.Serializable;

public class UserPO implements Serializable{//can we add a Userole just like the book did
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String password;
	
	public UserPO(){
		id=0;
		name="User";
		password="password";
	}
	
	public UserPO(int i,String n,String p){
		id=i;
		name=n;
		password=p;
	}
	
	/**
	 * 
	 * @return 获得用户名
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @return 获得用户ID
	 */
	public int getID(){
		return id;
	}
	
	/**
	 * 
	 * @return 获得用户密码
	 */
	public String getPassword(){
		return password;
	}
}

class CustomerPO extends UserPO{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String address;
	String phoneNumber;
	String defaultQuestion;
	String answerToQues;
	int credit=0;
	
	public CustomerPO(int i,String n,String p,String add,String pn,String d,String ans){
		super(i,n,p);
		address=add;
		phoneNumber=pn;
		defaultQuestion=d;
		answerToQues=ans;
	}
	
	/**
	 * 
	 * @return 获得用户地址
	 */
	public String getAddress(){
		return address;
	}
	
	/**
	 * 
	 * @return 获得用户电话号码
	 */
	public String getPhoneNumber(){
		return phoneNumber;
	}
	
	/**
	 * 
	 * @return 获得用户默认问题
	 */
	public String getDefaultQuestion(){
		return defaultQuestion;
	}
	
	/**
	 * 
	 * @return 获得用户默认问题答案
	 */
	public String getAnsToAns(){
		return answerToQues;
	}
	
	/**
	 * 
	 * @return 获得用户信用
	 */
	public int getCredit(){
		return credit;
	}
}

class HotelWorkerPO extends UserPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

class WebsitePromotePO extends UserPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}

class WebsiteManagerPO extends UserPO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
}
