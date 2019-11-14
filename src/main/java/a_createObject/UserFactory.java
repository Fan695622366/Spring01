package a_createObject;

/**
 *通过工厂方式创建出对象 
 */
public class UserFactory {

	/**
	 * 静态方法创建对象
	 * @return
	 */
	public static User getUser() {
		return new User(1, "siri",23);
	}
	
	/**
	 * 非静态方法创建对象
	 * @return
	 */
	public User getUser2() {
		return new User(2,"tom",23);
	}
	
	
	
	
	
}
