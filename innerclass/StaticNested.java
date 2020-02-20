package innerclass;

public class StaticNested {
	static int data=30;
	static class nest
	{
		static void msg()
		{
			System.out.println(data);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //StaticNested.nest obj=new StaticNested.nest();
    //obj.msg();
		StaticNested.nest.msg();
	}

}
