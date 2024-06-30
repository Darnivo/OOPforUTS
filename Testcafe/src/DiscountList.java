import java.util.ArrayList;


public class DiscountList {
	ArrayList<Discounts> DiscountsList = new ArrayList<>();
	private double min=Integer.MAX_VALUE;
	
	public DiscountList() {
		DiscountsList.add(new Discounts(50 ,75));
		DiscountsList.add(new Discounts(10 ,5));
		DiscountsList.add(new Discounts(50 ,15));

		for(Discounts d : DiscountsList) {
            if(d.getTreshold() < min) {
                min = d.getTreshold();
            }
        } 
	}

	public ArrayList<Discounts> getDiscountsList() {
		return DiscountsList;
	}

	public double getMin() {
		return min;
	}
	
	
	
}
