package ppkwu;

import java.util.Scanner;

public class MyCallback implements Callback{

	public String callback(int result)
	{
		int response = 0;
		String buf;
		Scanner input = new Scanner(System.in);
		if(result != 0)
		{
			System.out.println("Failed!!!");
			System.out.println("Write 1 if you want to change file name:");
			
			buf = input.nextLine();
			response = Integer.parseInt(buf);
			if(response == 1)
			{
				System.out.println("Please give new file name:");
				String buf2;
				buf2 = input.nextLine();
				return buf2;
			}
			return "";
		}
		System.out.println("Writing worked.");
		return "";
	}
}
