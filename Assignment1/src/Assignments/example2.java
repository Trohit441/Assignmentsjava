package Assignments;

import java.util.Scanner;

/* Example 2*/
public class example2 {

	public static void main(String[] args) {
		 
		 Scanner scan= new Scanner(System.in);
			System.out.println("Enter No:");
			int no=scan.nextInt();
			
		    for(int i=1;i<=no;i++)
		   
		    {
		        for (int j=no;j>=1;j--)
		       {
		           System.out.print(" ");
		          
		        }
		        System.out.println("");
		      
		      
		        for(int k=1;k<=i;k++)
		        {
		            System.out.print(k);
		        }
		              for(int y=i-1;y>=1;y--)
		        {
		            System.out.print(y);
		        }
		       System.out.println("");
		    }

	}

}
