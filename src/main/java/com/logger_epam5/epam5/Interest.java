package com.logger_epam5.epam5;

import java.io.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

abstract class Interest{
	double principal,rateOfInterest,years,total;
	private static final Logger logger = LogManager.getLogger(Interest.class);
	public static void ip() {
		logger.info("Follow the instructions to perform desired interest operation :\n"
				+ "Press 1 for Simple Interest\n"
				+ "Press 2 for Compound Interest\n"
			);
	}
	public void input()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		principal=Double.parseDouble(br.readLine());
		
		rateOfInterest=Double.parseDouble(br.readLine());
		years=Double.parseDouble(br.readLine());
	}
	abstract public void calculate();
	abstract public double output();
}