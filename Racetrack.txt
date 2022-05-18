class RaceTrack{
	public static void main(String[] args){
		Car c = new Car(2022,"Toyota",159);
		System.out.println("Year of Manufacture:- "+c.getYear());
		System.out.println("Car Manufacturer is :- "+ c.getMake());
		System.out.println("Speed:- "+c.getSpeed());
		
		c.accelerator();
		System.out.println("Speed Now :- "+c.getSpeed());
	}
}