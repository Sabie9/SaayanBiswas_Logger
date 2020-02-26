package com.logger_epam5.epam5;

/*import java.io.*;
import org.apache.log4j.BasicConfigurator;*/
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class Housing{
	String materialStandard,automation;
	double area;
	private static final Logger logger = LogManager.getLogger(Housing.class);
	public static void ip() {
		logger.info("Follow the instructions to perform desired interest operation :\n"
				+ "Press 1 for Standard Material\n"
				+ "Press 2 for Above Standard Material\n"
				+ "Press 3 for High Standard Material with No automation in Housing\n"
				+ "Press 4 for High Standard Material with Fully automated Housing");
	}
	public void input(String materialStandard,double area, String automation){
		this.materialStandard=materialStandard;
		this.area=area;
		this.automation=automation;
	}
	public double cost(){
		if(materialStandard=="Standard"){
			return 1200*area;}
		else if(materialStandard=="Above Standard"){
			return 1500*area;}
		else if(materialStandard=="High" && automation=="No"){
			return 1800*area;}
		else if(materialStandard=="High" && automation=="Full"){
			return 2500*area;}
		else{
			return 0;}
}
}
