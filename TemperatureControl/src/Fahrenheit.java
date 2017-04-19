/**
 * 
 * @author Jimmy Espinosa
 * 
 * Here we will convert Fahrenheit to Celcies and Kelvin
 *
 */


public class Fahrenheit {
	
	private double Temp;

	/** Construct a Fahrenheit object**/
	Fahrenheit() {
	}
	
	/** Construct a Fahrenheit object **/
	Fahrenheit(double newTemp){
		Temp = newTemp;
	}
	
	
	/** Return Fahrenheit to Celcius **/
	double fahrenheitToCelcius(){
		return ((Temp - 32)*5)/9;
	}
	
	/** Return Fahrenheit to Kelvin **/
	double fahrenheitToKelvin(){
		return (Temp + 459.67)*5/9;
	}
	
	
	/** Set a new temp for the equation **/
	
	void setTemp (double newTemp){
		Temp = newTemp;
	}

}
