import java.io.*;


public class Swapping {

	public static void main(String[] args) throws IOException
	{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the 1st number");
		int a = Integer.parseInt(input.readLine());
		System.out.println("Enter the 2nd number");
		int b = Integer.parseInt(input.readLine());

		System.out.println("The numbers before swapping are" + " " + a + " " + b);
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("The numbers after swapping are" + " " + a + " " + b);
	}

}
