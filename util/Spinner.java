package util;

import java.util.Random;
//import java.util.Scanner;

public final class Spinner {
	
	public static final int spin() {
		//System.out.println("Press r and then enter to spin: ");
		//Scanner scan = new Scanner(System.in);
		//String spinn = scan.nextLine();
		//if (spinn.equals("r"))
		//{	
			Random random = new Random();
			int spinResult = random.nextInt(6); //generate randomnumbers from 0 to 6 excluding 6 then return that number after adding 1
			
			//Since spin has to be from 1 and 6 so incrementing each number by 1
			spinResult = spinResult + 1;
			System.out.println(" rolled a " + spinResult);
		//	scan.close();
			return spinResult;		
		//}
		/*else
		{
			System.out.println("the button " + spinn + " is not r" );
			scan.close();
			return 0;
		}*/
		
	}

}
