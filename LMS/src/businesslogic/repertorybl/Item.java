package businesslogic.repertorybl;

import UI.mainUI.expressType;

public class Item {

	String id;
	expressType type;
	public Item(String id, expressType type) {
		super();
		this.id = id;
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public expressType getType() {
		return type;
	}
	
}
