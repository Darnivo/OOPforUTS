
public class IndividualOrder {
	private MenuItem type;
	private int qty;
	
	public IndividualOrder(MenuItem type, int qty) {
		this.type = type;
		this.qty = qty;
	}

	public MenuItem getType() {
		return type;
	}

	public int getQty() {
		return qty;
	}

	
	
}
