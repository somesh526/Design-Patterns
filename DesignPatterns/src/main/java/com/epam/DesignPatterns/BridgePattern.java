package com.epam.DesignPatterns;

abstract class Vehicle { 
    protected Workshop w1; 
    protected Workshop w2; 
      
    protected Vehicle(Workshop w1, Workshop w2) 
        { 
            this.w1 = w1; 
            this.w2 = w2; 
        } 
      
    abstract public void manufacture(); 
} 
interface Workshop 
{ 
 abstract public void work(); 
} 
class Produce implements Workshop { 
	  public void work() 
	 { 
	     System.out.print("Producing vehicle"); 
	 } 
	} 
class Assemble implements Workshop { 
	  public void work() 
	 { 
	     System.out.println("Assembing Vehicle."); 
	 } 
	} 
class Bike extends Vehicle { 
public Bike(Workshop w1, Workshop w2) 
 { 
     super(w1, w2); 
 } 
  public void manufacture() 
 { 
     System.out.print("Bike "); 
     w1.work(); 
     w2.work(); 
 } 
} 
class Car extends Vehicle { 
public Car(Workshop w1, Workshop w2) 
    { 
        super(w1, w2); 
    } 
  
     public void manufacture() 
    { 
        System.out.print("Car "); 
        w1.work(); 
        w2.work(); 
    } 
  
} 
public class BridgePattern {
	public static void main(String[] args) 
	 { 
	     Vehicle vehicle1 = new Car(new Produce(), new Assemble()); 
	     vehicle1.manufacture(); 
	     Vehicle vehicle2 = new Bike(new Produce(), new Assemble()); 
	     vehicle2.manufacture(); 
	 } 
}