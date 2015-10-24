package LMS.po;

import java.io.Serializable;

import LMS.bl.User.UserRole;

public class UserPO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String id;
	String name;
	String password;
	UserRole role;

	public UserPO(String id, String name, String password, UserRole role) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.role = role;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public String getPassword() {
		return password;
	}


	public UserRole getRole() {
		return role;
	}

}

