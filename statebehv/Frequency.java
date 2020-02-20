package statebehv;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="though good";
		char ch='o';
		int freq=0;
		int i=0;
		for(i=0;i<str.length();i++)
		{
			if(ch==str.charAt(i))
		{
			++freq;
		}
	}
	System.out.print(freq);
	
}
}