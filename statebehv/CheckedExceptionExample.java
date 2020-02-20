package statebehv;
import java.io.IOException;
import java.sql.SQLException;

public class CheckedExceptionExample {

	public static void main(String[] args) {
		int ch[]= {1,2,3,4};
		// TODO Auto-generated method stub
		//throw new IOException();  //checked exception must be handled at compile time
		//throw new ArithmeticException();  //unchecked exception we can handled at run time
        System.out.println(ch[5]);   
		try
        {
		throw new ArrayIndexOutOfBoundsException(); //unchecked exceptions will be handled at runtime
        throw new IOException(); 
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println(e.getMessage());
        }
        
        }
	
}
