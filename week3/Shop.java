import java.util.*;
import java.util.stream.*;

public class Shop
{
	Car car;

	static List<Car> carsInStock = new ArrayList<>();

	static 
	{
		carsInStock.add(new Car("Mercedes", 93000D, 2012));
		carsInStock.add(new Car("Toyota", 10000D, 2017));
		carsInStock.add(new Car("Lexus", 14000D, 2010));
		carsInStock.add(new Car("BMW", 32000D, 2015));
	}
	
 
	public Shop(String carName, Double carPrice, Integer carYear)
	{
		this.car = new Car(carName, carPrice, carYear);
	}

	public Car buyCar()
	{
		return carsInStock.stream().filter(c ->
		{
			if(c.getName().equals(car.getName()) && c.getPrice().equals(car.getPrice()) && c.getYear().equals(car.getYear()))
			{
				System.out.println("check");
				return true;
			}
			return false;
		}).collect(Collectors.toList()).get(0);
	}

}

