import java.util.*;
import java.io.*;

class Recursion{
	public static void main(String args[]) throws IOException
	{
		System.out.println("Enter a number");
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		int abc = Integer.parseInt(input.readLine());
		
		int result = factorial(abc);
		System.out.println("The factorial of a number is" + "" + result);
	}
	
	public static int factorial(int xyz)
	{
		if(xyz <= 1)
		{
			return 1;
		}
		else
		{
			return xyz * factorial(xyz - 1);
		}
		}
}



https://www.facebook.com/laughingcolours/photos/a.10150471189319578.388832.173770089577/10154042886134578/?type=3&theater

https://www.facebook.com/laughingcolours/photos/a.10150471189319578.388832.173770089577/10154042919964578/?type=3&theater
