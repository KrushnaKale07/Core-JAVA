class Vehical 
{//MethodOverriding
	public static void main(String[] args) 
	{
		Java java = new Java();
		System.out.println(java.topSpeed());

		Bike bike = new Bike();
		System.out.println(bike.topSpeed());
	}
}
