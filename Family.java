class Family 
{
	public static void main(String[] args) 
	{
		Father father = new Father();
		System.out.println("Fathers Payment = "+father.payment());
		System.out.println("Fathers Pushups = "+father.pushups());

		Son son = new Son();
		System.out.println("Sons Payment = "+son.payment());
		System.out.println("Sons Pushups = "+son.pushups());
	}
}
