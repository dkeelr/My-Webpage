// Danica Keeler, Student number: 220538872

package question_3;

import java.util.Scanner; 
import java.text.DecimalFormat;

public class question3 {
	
	public static void main(String[] args) 
	{
		//create scanner object
		Scanner scan = new Scanner(System.in);
		
		//user inputs radius, value is assigned to variable radius
		System.out.println("Enter the radius of the sphere: ");
		int radius = scan.nextInt();
		
		//area is calculated and assigned to variable area
		double area = 4 * Math.PI * Math.pow(radius,  2);
		//volume is calculated and assigned to variable volume
		double volume = (4.0/3.0) * Math.PI * Math.pow(radius, 3);
		//use DecimalFormal class to only print 2 decimal places
		DecimalFormat fmt = new DecimalFormat ("0.##");
		
		//output solutions to 2 decimal places
		System.out.println ("The circle's area: " + fmt.format(area));		
		System.out.println("The volume of the sphere is: " + fmt.format(volume));	
	}

}
