
public class CarV7Tester
{
    public static void main(String[] args)
       {
        System.out.print('\u000C'); 
        String name;
        int endMiles, startMiles;
        double gallons, price;
        
        //CarV7 car1 = new CarV7(name, endMiles, startMiles, gallons, price);
        //CarV7  carv1 = new CarV7();
        CarV7 car1 = new CarV7("01 Honda Odessey", 242678, 242962, 14.6, 2.21);
        int tripMiles1 = car1.calcTripMiles(car1.startMiles, car1.endMiles);
        double MPG1 = car1.calcMPG(tripMiles1, car1.gallons);
        double cost1 = car1.calcCost(car1.price, car1.gallons);
        double GPM1 = car1.calcGPM(car1.gallons, tripMiles1);
        
        
    
        
        System.out.printf("%20s %17s %17s %17s %17s %17s %17s %17s %17s\n","Types of Car", "Start Miles", "End Miles", "Distance", "Gallons", "Price", "cost", "Miles/Gallons", "Gallons/Miles");
        System.out.println("================================================================================================================================================================");
        System.out.printf("%20s %17s %17s %17s %17s %17s %17.4s %17.4s %17.4s\n", car1.name, car1.startMiles, car1.endMiles, tripMiles1, car1.gallons, car1.price, cost1, MPG1, GPM1);
        
        CarV7 car2 = new CarV7("11 Kia Sedona", 42543, 42976, 15.1, 2.19);
        int tripMiles2 = car2.calcTripMiles(car2.startMiles, car2.endMiles);
        double MPG2 = car2.calcMPG(tripMiles2, car2.gallons);
        double cost2 = car2.calcCost(car2.price, car2.gallons);
        double GPM2 = car2.calcGPM(car2.gallons, tripMiles2);
        
        System.out.printf("%20s %17s %17s %17s %17s %17s %17.4s %17.4s %17.4s", car2.name, car2.startMiles, car2.endMiles, tripMiles2, car2.gallons, car2.price, cost2, MPG2, GPM2);
        
        
       }
}