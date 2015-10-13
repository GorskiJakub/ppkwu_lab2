package ppkwu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {

	private static Callback my_callback;

	public static void main(String[] args) {
		String string1;
		String string2;
		String fname;
		my_callback = new MyCallback();
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter string 1:");
		string1 = input.nextLine();
		System.out.println("Enter string 2:");
		string2 = input.nextLine();
		System.out.println("Enter fname:");
		fname = input.nextLine();

		try_open_and_write(string1, string2, fname, my_callback);
	}

	private static void try_open_and_write(String string1, String string2, String fname, Callback my_callback) {
		File file = new File(fname + ".txt");
		PrintWriter zapis;
		Scanner input = new Scanner(System.in);
		try {
			zapis = new PrintWriter(fname + ".txt");

			String new_fname = fname;
			while (input.nextLine().startsWith("y")) {
				System.out.println(string2);
				new_fname = main.my_callback.callback(1);
				if (new_fname.length() <= 0) {
					break;
				} 
				else {
					new_fname = new_fname.substring(0, new_fname.length() - 1);
				}
				if (file.exists()) {
					zapis.println("Hello World!\n");
					zapis.close();
					main.my_callback.callback(0);
					System.out.println(string1);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
