import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Car myCar = new Car();
        Bicycle myBike = new Bicycle();
        Buildings myHouse = new Buildings();

        ArrayList<carbonFootprint> carbon= new ArrayList<carbonFootprint>(); 

        // myCar.getCarbonFootprint();
        // myBike.getCarbonFootprint();

        carbon.add(myBike);
        carbon.add(myCar);
        carbon.add(myHouse);

        for (int i = 0; i < carbon.size(); i++) {
            carbon.get(i).getCarbonFootprint();
        }
    }
}

// How easy to add more classes: Very easy, just need to add the correct attributes to count the emmission and that's it