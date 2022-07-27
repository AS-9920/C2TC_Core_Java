//Eligible for Marriage or nor checking using Decision Making with Operator
package com.tns.assignment;
import java.util.Scanner;
public class DecisionMaking2 
{
		public static void main(String[] args) 
		{
			// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int boyage, girlage;
			System.out.println("Enter Age of Boy");
			boyage = input.nextInt();
			System.out.println("Enter Age of Girl");
			girlage = input.nextInt();
			if(boyage>=21 && girlage>=18)
			System.out.print("Congratulation You are Eligible");
			else
			System.out.print("Padhai Me Dhyan De Phele");
		}

	}
