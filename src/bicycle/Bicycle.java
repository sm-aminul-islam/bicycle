
package bicycle;


public class Bicycle {

   
    public static void main(String[] args) {
      
        // create two different bicycledemo object 
        BicycleDemo bike1 = new BicycleDemo();
        BicycleDemo bike2  = new BicycleDemo();
        bike1.changecadence(50);
        bike1.changegear(2);
        bike1.speedup(10);
        bike1.printstates();
        bike2.changecadence(60);
        bike2.changegear(2);
        bike2.speedup(20);
        bike2.printstates();
        
        
            }
    
}
