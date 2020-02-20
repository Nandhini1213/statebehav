package Excep;

public class ExceptionsExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		int a;
		//a=10/0;
		int c[]= {1};
		System.out.println(c[32]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	finally
	{
		System.out.println("executed");
	}
		System.out.println("yes");
	}

}
