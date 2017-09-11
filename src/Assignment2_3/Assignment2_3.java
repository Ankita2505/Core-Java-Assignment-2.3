package Assignment2_3;
/*
 * program to print the “X” pattern
 */
import java.util.Scanner;//importing scanner class
public class Assignment2_3 
{
	public static void main(String[] args) //Start of Main Class
	{
		// TODO Auto-generated method stub
		int i,j,n;
		Scanner sc=new Scanner(System.in);//creating objects of scanner class
		System.out.println("Enter value for X pattern to print");//user input for printing X Pattern
		n=sc.nextInt();
		sc.close();	 
	    for(i=0;i<n;i++) //Start of outer For Loop
	    {
	        for(j=0;j<n;j++)//Start Of Inner For Loop
	        {
	            if(i==j || j==(n-(i+1)))
	            {
	                System.out.print('*');
	            }
	            else
	            {
	                System.out.print(" ");
	            }
	        }//Close of Inner For Loop
	       System.out.println();
	    }//Close of Outer For Loop
	}// Close of Main Class
}
