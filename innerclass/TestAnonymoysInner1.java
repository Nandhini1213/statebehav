package innerclass;
interface vickymad
{
	void eat();
}

public class TestAnonymoysInner1
{
public static void main(String[] args)
{
	vickymad v=new vickymad()
			{

				@Override
				public void eat() {
					// TODO Auto-generated method stub
					System.out.println("eating");
				}
		
			};
			v.eat();
	
}
}
