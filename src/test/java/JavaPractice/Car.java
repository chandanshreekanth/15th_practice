package JavaPractice;

public class Car
{
	int car_cost;
	String car_model;
	
	Car(int car_cost , String car_model)
	{
		int Cost = car_cost;
		String Model = car_model;
	}
	public static void main(String[] args)
	{
		Car c1=new Car(95000 , "Maruti");
		System.out.println(c1.car_cost);
		System.out.println(c1.car_model);
		
	}
	
	
	
	

	
	
	

}
