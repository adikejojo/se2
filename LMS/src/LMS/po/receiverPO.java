package LMS.po;

import java.io.Serializable;

public class receiverPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String name;
	String address;
	String unit;
	String phoneNumber;
	public receiverPO(String name, String address,
			String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
//		this.unit = unit;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getUnit() {
		return unit;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
}
