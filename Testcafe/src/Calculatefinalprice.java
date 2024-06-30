
public class Calculatefinalprice {
	public void calculate(Orders orders, DiscountList list) {
        
		System.out.printf("Order by %s for:\n",orders.getCustomer());
		for (IndividualOrder order : orders.getItems()) {
			System.out.printf("%s($%s each) x %s\n",order.getType().getName(),order.getType().getPrice(),order.getQty());
		}
		double FinalPrice = orders.getTotal();
		boolean getDisc = false;
		int maxdisc=0; 
		if (FinalPrice > list.getMin()) {
			getDisc = true;
			for (Discounts d : list.getDiscountsList()) {
				if(FinalPrice > d.getTreshold() && maxdisc < d.getPercentage()) {
					 maxdisc = d.getPercentage();
				}
			}
			FinalPrice *= (1-((double)maxdisc/100));
		}
	
		System.out.printf("For the total price of: $%.3f\n",FinalPrice);
		if(getDisc) {
			System.out.println("Discount of "+maxdisc+"% applied");
		}
	}
}
