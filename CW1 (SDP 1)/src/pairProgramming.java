import java.util.Scanner;


public class pairProgramming {
	
	static int [] cw1 = new int [30];
	static int [] cw2 = new int [30];
	static int [] cw3 = new int [30];
	static int [] tot_cw1= new int[30];
	static int [] tot_cw2= new int[30];
	static int [] tot_cw3= new int[30];
	
	public static void main(String[] args){
		GetName();
		GetMarks();
	}
	public static void GetName() 
	{
		String [] fName = new String [30];
		String [] lName = new String [30];
		int [] regNo = new int [30];
		String [] address = new String [30];
		int [] contact = new int [30];
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 30; i++)
		{
			System.out.print("Enter First Name: ");
			fName [i]=input.nextLine();
		}
		for(int i = 0; i < 30; i++)
		{
			System.out.print("Enter Last Name: ");
			lName[i]=input.nextLine();
		}
		for(int i = 0; i < 30; i++)
		{
			System.out.print("Enter Registration No.: ");
			regNo [i]=input.nextInt();
		}
		for(int i = 0; i < 30; i++)
		{
			System.out.print("Enter Postal Address: ");
			address [i]=input.next();
		}
		for(int i = 0; i < 30; i++)
		{
			System.out.print("Enter Contact No: ");
			contact[i]=input.nextInt();
		}
		
	}

	public static void GetMarks()
	{
		
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i < 30 ; i++)
		{
		System.out.print("Enter Coursework 01 Marks:  ");
		cw1[i]=input.nextInt();
		}
		for(int i = 0; i < 30 ; i++)
		{
		System.out.print("Enter Coursework 02 Marks:  ");
		cw2[i]=input.nextInt();
		}
		for(int i = 0; i < 30 ; i++)
		{
		System.out.print("Enter Coursework 03 Marks:  ");
		cw3[i]=input.nextInt();
		}
	}	
	
	public static void classAverage()
	{
		int classTotal = 0;
		for(int i = 0; i < 30; i++)
		{
			
		}
		
		
		
		
		
		
		
	}
	
	
}	
		
		
		
	

