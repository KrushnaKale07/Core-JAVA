class Demo3 
{//ConstructorOverloading

	Demo3()
	{
		System.out.println("Demo3()");
	}

	Demo3(int a){
		System.out.println("Demo3("+a+")");
	}

	Demo3(char a)
	{
		System.out.println("Demo3("+a+")");
	}

	Demo3(boolean a)
	{
		System.out.println("Demo3("+a+")");
	}

	Demo3(String a)
	{
		System.out.println("Demo3("+a+")");
	}

	public static void main(String[] args) 
	{
		Demo3 demo1=new Demo3();
		Demo3 demo2=new Demo3(23);
		Demo3 demo3=new Demo3('a');
		Demo3 demo4=new Demo3(true);
		Demo3 demo5=new Demo3("Krushna");
		System.out.println("Hello World!");
	}
}
