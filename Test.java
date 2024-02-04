class Test
{
	public static void main(String[] args)
	{


		int num = 7;
		String name = "7";
		System.out.println("Hello This is First Program");

		if(num==7 && name.equals("7"))
		{
			System.out.println(num+" !! Thala for a Reason and Bole Jo Koyal.....");
			System.out.println("\n"); 
			System.out.println("\n"); 
			System.out.println("\n"); 
			
			System.out.println("This will be execeuted by JENKINS in #4 by AUTO ");
		}
		else
		{
			System.out.println(" Sorry , No Thala for You ");	
		}

		System.out.println("The Bike.class has been added");

		System.out.println();
		Bike b = new Bike(1, "Yamaha RX 100", 98);
		Bike b1 = new Bike(2, "KTM Duke 390 ", 373); 
		Bike b2 = new Bike(3, "RAJDOOT 350 ", 349); 
		System.out.println(b);
		System.out.println(b1);
		System.out.println(b2);



	}


}