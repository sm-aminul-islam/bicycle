
package bicycle;

public class BicycleDemo {
    int cadence =0;
    int speed =0;
    int gear = 1 ;
    
    void changecadence(int newvalue){
        cadence = newvalue;
    }
    void changegear(int newvalue){
        gear = newvalue;
    }
    void speedup(int increment){
        speed += increment;
    }
    void applybreak(int decrement){
        speed -=decrement;
    }
    void printstates(){
        System.out.println("cadence:"+cadence   +"speed:" +speed   +"gear:"+gear);
    }
    
    
}
