
public class Kelvin {
	
	private double Temp;
	
	/* Construct a Kelvin object */
	Kelvin(){
	}
	
	/* Construct a NEW Kelvin object */
	Kelvin(double newTemp){
		Temp = newTemp;
	}
	
	/* Convert Kelvin to Celsius */
	
	double kelvinToCelsius(){
		return Temp - 273.15;
	}
	
	/* Convert Kelvin to Fahrenheit */
	
	double kelvinToFahrenheit(){
		return Temp * 9/5 - 459.67;
	}
	
	/* Set a new Temp for the equation */
	void setTemp (double newTemp){
		Temp = newTemp;
	}


}
