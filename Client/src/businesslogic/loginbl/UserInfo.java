package businesslogic.loginbl;

public interface UserInfo {
	
	/**
	 * 
	 * @return 获得在线用户ID
	 */
	public int getID();
	
	/**
	 * 
	 * @param id
	 * @return 设置在线用户ID
	 */
	public void setID(int id);
	
	/**
	 * 
	 * @return 获得在线用户name
	 */
	public String getName();
	
	/**
	 * 
	 * @param name
	 * @return 设置在线用户name
	 */
	public void setName(String name);
	
	/**
	 * 
	 * @return 获得在线用户password
	 */
	public String getPassword();
	
	/**
	 * 
	 * @param password
	 * @return 获得在线用户password
	 */
	public void setPassword(String password);
}
