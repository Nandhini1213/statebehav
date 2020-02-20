package innerclass;

public class LocalInner1 {
	private int data=30;
	void display()
	{
		class Local
		{
			void msg()
			{
				System.out.println(data);
			}
		}
		Local l=new Local();
		l.msg();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalInner1 d=new LocalInner1();
		d.display();

	}

}
