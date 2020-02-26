package com.logger_epam5.epam5;

import java.io.*;

class ClientApplicationDemoInterestCalculator{
	public static void main(String args[])throws IOException{
		System.out.println("Welcome to Saayan's Interest Calculator");
		int ch=1;
		SimpleInterest a=new SimpleInterest();
		CompoundInterest b=new CompoundInterest();
		do{
		Interest.ip();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int x=Integer.parseInt(br.readLine());
		switch (x){
			case 1: System.out.println("Enter Principal,Rate of Interest,Time in years");
				a.input();
				a.calculate();
				System.out.println("The Required SI is : "+a.output());
				break;
			case 2: System.out.println("Enter Principal,Rate of Interest,Time in years");
				b.input();
				b.calculate();
				System.out.println("The Required CI is : "+b.output());
				break;
		}	
		System.out.println("Press 0 to EXIT or any other digit to CONTINUE");
		ch=Integer.parseInt(br.readLine());
		}while(ch!=0);
	}
}
	
