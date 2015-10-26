package vo;

import java.util.Vector;

public class SendReceiptVO extends Vector<String>{

	/**
	 * @param S stand for sender, R stand for receiver
	 * @param content ÄÚÈÝ
	 * @param volume Ìå»ý
	 * @author dzm
	 */
	private static final long serialVersionUID = 1L;

	public SendReceiptVO(String ID, String nameS, String phoneS, String addressS, 
			                        String nameR, String phoneR, String addressR, 
			                        double weight, double volume, String content,
			                        String type, double packFee){
		this.add(ID);
		this.add(nameS);
		this.add(phoneS);
		this.add(addressS);
		this.add(nameR);
		this.add(phoneR);
		this.add(addressR);
		this.add(""+weight);
		this.add(""+volume);
		this.add(content);
		this.add(type);
		this.add(""+packFee);
	}
	
	public String getID(){
		return this.get(0);
	}
	public String getnameS(){
		return this.get(1);
	}
	public String getphoneS(){
		return this.get(2);
	}
	public String getaddressS(){
		return this.get(3);
	}
	public String getnameR(){
		return this.get(4);
	}
	public String getphoneR(){
		return this.get(5);
	}
	public String getaddressR(){
		return this.get(6);
	}
	public double getweight(){
		
		double weight =Double.parseDouble(this.get(7));
		return weight;
	}
	public double getvolume(){
		
		double volume =Double.parseDouble(this.get(8));
		return volume;
	}
	public String getcontent(){
		return this.get(9);
	}
	public String gettype(){
		return this.get(10);
	}
	public double getpackFee(){
		
		double packFee =Double.parseDouble(this.get(12));
		return packFee;
	}
}
