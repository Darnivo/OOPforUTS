public class Car implements carbonFootprint{
    int avg_MPG= 36;
    int annual_dist = 6900;
    String fueltyp = "Gassoline";

    public void getCarbonFootprint(){
        int annua_fuel = annual_dist / avg_MPG;
        int emmis = annua_fuel * 8887;
        
        System.out.println("Carbon footprints of: Car");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Average Miles per Gallon (MPG) :" + avg_MPG);
        System.out.println("Annual Distance :" + annual_dist);
        System.out.println("Annual fuel consumption = Annual Distance / Miles per Gallon =" + emmis);
        System.out.println("Emmission :" + emmis + " g CO2");
        System.out.println("======================================================================");
    }
}
