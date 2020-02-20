package statebehv;

public class WrapperExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a=78;        //primitive type;
         Integer i=new Integer(0); //wrapper type;(object)
         i=a;    //autoboxing
         System.out.println(i+"Autoboxing");
         int b;
         b=i; //unboxing
         System.out.println(b+"unboxing");
         //System.out.println(i.byteValue());
                     
	}

}
