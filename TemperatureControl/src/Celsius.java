
public class Celsius {
	
	private double Temp;
	
	/**
	 * Construct a Celcius object
	 */
	
	Celsius(){	
	}
	
	/** Construct a new Celcius object **/
	Celsius(double newTemp){
		Temp = newTemp;
	}
	
	/**
	 * Convert Celsius to Fahrenhet
	 */
	double celsiusToFahrenheit(){
		return Temp * 9/5 + 32;
	}
	
	/**
	 * 
	 * Convert Celsius to Kelvin
	 */
	
	double celsiusToKelvin(){
		return Temp + 273.15;
	}
	
	
	/**
	 * Set a new temp
	 */
	void setTemp (double newTemp){
		Temp = newTemp;
	}

	



}
