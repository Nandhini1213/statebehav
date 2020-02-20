package innerclass;
abstract class person
{
	abstract void eat();
}

public class TestAnonymoys {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		person p=new person()
				{
					@Override
					void eat() {
						// TODO Auto-generated method stub
						System.out.println("Nice Food");
					}
					};
		p.eat();

	         }

}

