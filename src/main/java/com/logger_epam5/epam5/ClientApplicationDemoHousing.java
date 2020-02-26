package com.logger_epam5.epam5;
import java.io.*;

class ClientApplicationDemoHousing{
	public static void main(String args[])throws IOException{
		System.out.println("Welcome to Saayan's Housing Cost Calculator");
		int ch=1;
		Housing h= new Housing();
		do{
		Housing.ip();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());

		System.out.println("Enter area of house in square feet");
		double area=Double.parseDouble(br.readLine());
		switch (x){
			case 1: h.input("Standard",area,"No");
				System.out.println("The Required Cost is : "+h.cost());
				break;
			case 2: h.input("Above Standard",area,"No");
				System.out.println("The Required Cost is : "+h.cost());
				break;
			case 3: h.input("High",area,"No");
				System.out.println("The Required Cost is : "+h.cost());
				break;
			case 4: h.input("High",area,"Full");
				System.out.println("The Required Cost is : "+h.cost());
				break;
		}	
		System.out.println("Press 0 to EXIT or any other digit to CONTINUE");
		ch=Integer.parseInt(br.readLine());
		}while(ch!=0);
	}
}
	