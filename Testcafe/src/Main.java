import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
			
		ArrayList<MenuItem> items = new ArrayList<>();
		items.add(new Food("Burger", 5.99));
		items.add(new Food("Fries", 2.99));
		items.add(new Drink("Soda", 1.49, Drink.size.SMALL));
		items.add(new Drink("Soda", 1.99, Drink.size.MEDIUM));
		items.add(new Drink("Milkshake", 2.99, Drink.size.SMALL));
		items.add(new Drink("Milkshake", 3.99, Drink.size.MEDIUM));
		items.add(new Drink("Milkshake", 4.49, Drink.size.LARGE));
	
	
	for(MenuItem x: items ) {
		System.out.printf("%s $%s",x.getName(),x.getPrice());
		if(x instanceof Drink) {
			Drink drink = (Drink) x;
			System.out.printf(" %s",drink.getSetsize().toString().toLowerCase());
		}
		System.out.println("");
	}
	System.out.println("");
	
	//order of 2 burgers + 5 small soda
	ArrayList<IndividualOrder> orders = new ArrayList<>();
	orders.add(new IndividualOrder(items.get(0),2));
	orders.add(new IndividualOrder(items.get(2),5));
	
	Orders Finalorder = new Orders("John",orders);
	
	DiscountList disc = new DiscountList();
//	System.out.println(Finalorder.getTotal());
	Calculatefinalprice calculator = new Calculatefinalprice();
	calculator.calculate(Finalorder,disc);
	
	
	
	}
}
