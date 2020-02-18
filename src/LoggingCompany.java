
import java.util.Scanner;

public class LoggingCompany {
	
	public static void main(String[] args) {
		System.out.println("How long is the log 0.25, 0.5 or 1 meter");
		Scanner userAnswer = new Scanner(System.in);
		double number = userAnswer.nextDouble();
		
		if (number == 0.25 )
			
		{
			System.out.println("The max amount of logs the truck can carry is 220");
		}
		else if (number == 0.5)
		{
			System.out.println("The max amount of logs the truck can carry is 110");

		}
		else if(number == 1)
		{
			System.out.println("The max amount of logs the truck can carry is 55");

		}
		else
		{
			System.out.println("Please enter one of the lengths shown ");

		}
		
	
	}

}
