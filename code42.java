/*write a java program to create a vehicle class hiracy.The base 
class should be vehicle with subclass truck , car, motorcycle.
each subclass should have properties such as  make, model,year,fuel_type.
implements methods  for calculating fuel efficiency and maximum speed*/



/*import java.util.*;
class Vehicle
{
	String make;
	String model;
	int year;
	String fuel_type;
	public Vehicle(String make,String model,int year,String fuel_type)
	{
		this.make=make;
		this.model=model;
		this.year=year;
		this.fuel_type=fuel_type;
	}
	void cal_fuel_efficiency()
	{
	}
	void cal_max_speed()
	{
	}
	
}
class Truck extends Vehicle
{
	public Truck(String make,String model,int year,String fuel_type)
	{
		super(make,model,year,fuel_type);
	}
	void cal_fuel_efficiency()
	{
	}
	void cal_max_speed()
	{
	}
	
}
class Car extends Vehicle
{
	public Car(String make,String model,int year,String fuel_type)
	{
		super(make,model,year,fuel_type);
	}
	void cal_fuel_efficiency()
	{
	}
	void cal_max_speed()
	{
	}
}
class Motorcycle extends Vehicle
{
	public Motorcycle(String make,String model,int year,String fuel_type)
	{
		super(make,model,year,fuel_type);
	}
	void cal_fuel_efficiency()
	{
	}
	void cal_max_speed()
	{
	}
}
class Main3
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
	}
	
}*/


import java.util.*;

// ---------------- Base Class ----------------
class Vehicle {
    String make;
    String model;
    int year;
    String fuel_type;

    public Vehicle(String make, String model, int year, String fuel_type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuel_type = fuel_type;
    }

    // Default methods (can be overridden)
    double calcFuelEfficiency() {
        return 0.0;
    }

    double calcMaxSpeed() {
        return 0.0;
    }

    void showDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Fuel Type: " + fuel_type);
    }
}


class Truck extends Vehicle {

    public Truck(String make, String model, int year, String fuel_type) {
        super(make, model, year, fuel_type);
    }

    
    
    double calcFuelEfficiency() {
        return 5.0 + (2025 - year) * 0.1;  
    }
    
    double calcMaxSpeed() {
        return 90 + (year - 2010) * 1.5;
    }
}


class Car extends Vehicle {

    public Car(String make, String model, int year, String fuel_type) {
        super(make, model, year, fuel_type);
    }

 
    double calcFuelEfficiency() {
        return 12 + (2025 - year) * 0.15;
    }


    double calcMaxSpeed() {
        return 160 + (year - 2010) * 2;
    }
}

class Motorcycle extends Vehicle {

    public Motorcycle(String make, String model, int year, String fuel_type) {
        super(make, model, year, fuel_type);
    }

    
    double calcFuelEfficiency() {
        return 35 + (2025 - year) * 0.2;
    }

    
    double calcMaxSpeed() {
        return 120 + (year - 2010) * 1.8;
    }
}


public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Vehicle Type (truck/car/motorcycle): ");
        String type = sc.nextLine().toLowerCase();

        System.out.print("Enter make: ");
        String make = sc.nextLine();

        System.out.print("Enter model: ");
        String model = sc.nextLine();

        System.out.print("Enter year: ");
        int year = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter fuel type: ");
        String fuel = sc.nextLine();

        Vehicle v;

    
        switch (type) {
            case "truck":
                v = new Truck(make, model, year, fuel);
                break;
            case "car":
                v = new Car(make, model, year, fuel);
                break;
            case "motorcycle":
                v = new Motorcycle(make, model, year, fuel);
                break;
            default:
                System.out.println("Invalid type!");
                return;
        }

       
        System.out.println("\n----- Vehicle Details -----");
        v.showDetails();

        System.out.println("\nFuel Efficiency: " + v.calcFuelEfficiency() + " km/l");
        System.out.println("Max Speed: " + v.calcMaxSpeed() + " km/h");
    }
}

