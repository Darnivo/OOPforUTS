import java.util.ArrayList;

public class Orders {
	private String customer;
	private double total=0;
	ArrayList<IndividualOrder> items = new ArrayList<>();
	
	
	public Orders(String customer, ArrayList<IndividualOrder> items) {
		this.customer = customer;
		this.items = items;
		
		for (IndividualOrder x: items) {
			total += x.getType().getPrice()*x.getQty();
		}
	}


	public String getCustomer() {
		return customer;
	}

	public double getTotal() {
		return total;
	}


	public ArrayList<IndividualOrder> getItems() {
		return items;
	}
	
	
	
}
