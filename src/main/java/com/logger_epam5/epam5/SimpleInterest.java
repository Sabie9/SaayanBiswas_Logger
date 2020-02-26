package com.logger_epam5.epam5;

/*import java.io.*;
import java.lang.Math;*/
class SimpleInterest extends Interest{
	double SI;
	public void calculate(){
		SI=principal*rateOfInterest*years/100;
		total=principal+SI;
	}
	public double output(){
		return SI;
	}
}