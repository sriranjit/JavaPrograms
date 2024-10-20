abstract class Vehicle{
    abstract void startEngine();
    abstract void stopEngine();
}

class Car extends Vehicle{
    public void startEngine(){
        System.out.println("Car Engine Started");
    }
    public void stopEngine(){
        System.out.println("Car Engine Stopped");
    }
}

class MotorCycle extends Vehicle{
    public void startEngine(){
        System.out.println("MotorCycle Engine Started");
    }
    public void stopEngine(){
        System.out.println("MotorCycle Engine Stopped");
    }
}

public class Abstraction
{
	public static void main(String args[]){
	    Car c=new Car();
	    MotorCycle m=new MotorCycle();
	    c.startEngine();
	    c.stopEngine();
	    m.startEngine();
	    m.stopEngine();
	}
	

}