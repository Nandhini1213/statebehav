package innerclass;

public class TestMemberOuter {
	private int data=90;
	class Inner
	{
		void msg()
		{
			System.out.println("data is"+data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMemberOuter obj=new TestMemberOuter();
		TestMemberOuter.Inner in=obj.new Inner();
		in.msg();
		

	}

}
