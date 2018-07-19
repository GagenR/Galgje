package Inheritance;

public class Bicycle {
    
    // the Bicycle class has three fields
    public int cadence;
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int cadence, int speed, int gear) {
        gear = 5;
        cadence = 10;
        speed = 15;
        
        System.out.println("De mountainbike heeft de volgende waarden " +
                cadence);
        
    }
        
   // the Bicycle class has four methods
    public void setCadence(int newValue) {
        cadence = newValue;
    }
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }

    public class MountainBike extends Bicycle {
        
        // the MountainBike subclass adds one field
        public int seatHeight;

        // the MountainBike subclass has one constructor
        public MountainBike(int height,
                            int cadence,
                            int speed,
                            int gear) {
            super(cadence, speed, gear);
            
            height = 12;
            
        System.out.println("De mountainbike heeft de volgende waarden " + height +
            cadence);
            
        }   
            
        // the MountainBike subclass adds one method
        public void setHeight(int newValue) {
            seatHeight = newValue;
            
            
        }
    }
    
    
}



