package Welcome;

public class HomeWork1 {
	
	public static void main(String args[])
	{
		int number = 1234;
		int remainder, sum = 0;
		
		while(number > 0)
		{
			remainder = number % 10;
			sum = sum + remainder;
			number = number / 10;
		}
System.out.println("Sum of the number = " +sum);		
		}

}

