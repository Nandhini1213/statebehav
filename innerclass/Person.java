package innerclass;

abstract class Person1 {

	abstract void eat();
}

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 p = new Person1() {
			@Override
			void eat() {
				// TODO Auto-generated method stub
				System.out.println("eating");
			}

		};
		p.eat();

	}
}
