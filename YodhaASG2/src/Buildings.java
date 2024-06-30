public class Buildings implements carbonFootprint{
    int el_usg = 4000;
    int em_fact = 619;
    String region = "Indonesia";
    public void getCarbonFootprint(){
        int co2emm = el_usg * em_fact;
        
        System.out.println("Carbon footprints of: Building");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Monthly electric usage :" + el_usg + "kwh");
        System.out.println("Region: " + region);
        System.out.println("Emmission Factor (different each region) :" + em_fact);
        System.out.println("CO2 Emmission = Monthly electric usage x Emmission factor =" + co2emm + "g CO2");
        System.out.println("======================================================================");
    }    
}
