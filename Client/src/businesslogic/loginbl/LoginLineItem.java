package businesslogic.loginbl;

public class LoginLineItem {
	int id;
	String name;
	String password;
	
	public LoginLineItem(int i,String n,String p){
		id=i;
		name=n;
		password=p;
	}

	/**
	 * 
	 * @return 获得在线用户ID
	 */
	public int getID(){
		return id;
	}
	
	/**
	 * 
	 * @param id
	 * @return 设置在线用户ID
	 */
	public void setID(int id){
		this.id=id;
	}
	
	/**
	 * 
	 * @return 获得在线用户name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * 
	 * @param name
	 * @return 设置在线用户name
	 */
	public void setName(String name){
		this.name=name;
	}
	
	/**
	 * 
	 * @return 获得在线用户password
	 */
	public String getPassword(){
		return password;
	}
	
	/**
	 * 
	 * @param password
	 * @return 获得在线用户password
	 */
	public void setPassword(String password){
		this.password=password;
	}
}
