package ppkwu;

public class main {

	public static void main(String [] args)
	{
		String string1;
		String string2;
		String fname;
		Callback my_callback = new MyCallback();
		
		System.out.println("Enter string 1:");
		string1 = System.console().readLine();
		System.out.println("Enter string 2:");
		string2 = System.console().readLine();
		System.out.println("Enter fname:");
		fname = System.console().readLine();
		
		try_open_and_write(string1,string2,fname,my_callback);
	}
}
