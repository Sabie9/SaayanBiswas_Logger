package com.logger_epam5.epam5;
import java.io.*;
import java.lang.Math;
class CompoundInterest extends Interest{
	double CI,compoundingFactor;
	public void input() throws IOException{
		super.input();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Compounding Factor:");
		compoundingFactor=Double.parseDouble(br.readLine());
	}
	public void calculate(){
		total=principal*Math.pow((1+rateOfInterest/(100*compoundingFactor)),(compoundingFactor*years));
		CI=total - principal;
	}
	public double output(){
		return CI;
	}
}
