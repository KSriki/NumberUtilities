/*
 * All in one number formatting class
 * Srikant Kumar Kalaputapu
 * June 27th, 2017
 */

import java.text.NumberFormat;
import java.util.Random;
public class NumberUtility {

	public static String percentage(double num){
		return NumberFormat.getPercentInstance().format(num);
	}

	public static String currency(double num){
		
		return NumberFormat.getCurrencyInstance().format(num);
	}

	public static String nDecimal(double num, int places){

		NumberFormat number = NumberFormat.getNumberInstance();
		number.setMaximumFractionDigits(places);

		return number.format(num);
	}
	
	public static double randAB(int a, int b){
		Random rand = new Random();
		
		return 1.0 * rand.nextInt(b-a +1) + a;
		
	}
	
	public static double max(double a, double b){
		return a > b ? a : b;
	}
	
	public static double min (double a, double b){
		return a > b ? b : a;
	}

}
