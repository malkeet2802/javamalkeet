/*CDAC Mumbai
PG-DBDA March22 Batch (Kharghar)
Marks : 40
---------------------------------------------------------------------------------------
Problem 1 : Accelerate the Car (20 Marks)
a) Create a new Java class named Car that has the following private fields
⚫ year - The year field is an int that holds a car's year model (e.g. 2010)
⚫ make - The make field is a String object that holds the make of the car (e.g. "Porsche")
⚫ speed - The speed field is an double that holds a car's current speed (e.g. 25.0)
b) In addition, the Car class should have the following methods.
⚫ Constructor - The constructor should accept the car's year, make, and beginning speed as 
arguments
◆ These values should be used to initialize the Car's year, make, and speed fields
⚫ Getter Methods - Write three accessor (getter) methods to get the values stored in an object's fields
⚫ accelerate - Write an accelerate method that has no arguments (parameters) passed to it and adds
1 to the speed field each time it is called
◆ For example: if the car was going 3 mph, accelerate would set the speed to 4 mph
c) Write a separate java class RaceTrack in a separate file with a main() method that
⚫ Create a new Car object (using the Car constructor method), passing in the year, make, and speed
⚫ Display the current status of the car object using the getter methods getYear(), getMake(), and
getSpeed()
⚫ Call the car's accelerate method and then re-display the car's speed using getSpeed()
*/
class Car {
	private int year;
	private String make;
	private double speed;
	
	
	Car(int year,String make,double speed){
		this.year=year;
		this.make=make;
		this.speed=speed;
	}
	public int getYear(){
		return this.year;
	}
	public String getMake(){
		return this.make;
	}
	public Double getSpeed(){
		return this.speed;
	}
	public double accelerator(){
		this.speed=this.speed+1;
		return this.speed;
	}
}