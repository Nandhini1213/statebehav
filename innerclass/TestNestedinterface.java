package innerclass;


interface Showable
{
	void show();
interface Message
{
	void msg();
}
}

public class TestNestedinterface implements Showable.Message
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Showable.Message m=new TestNestedinterface(); //upcasting here-super class reference is assigned to an subclass object
		m.msg();

	}

	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("MadhuNandu");
	}

	

}
