package statebehv;

public class ExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		
    System.out.println("Program execution start");
    try
    {
    System.out.println(a/0);
    }
    catch(Exception e)
    {
    	System.out.println(e.getMessage());
    }
    finally
    {
    	System.out.println("I am always executing whether exception occurs or not");
    }
    System.out.println("program execution is done");
    
	}

}
