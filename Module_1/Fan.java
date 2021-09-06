/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 
public class Fan {
	
	//Data Fields for fan speed, on/off, radius and color
	final int STOPPED = 0;
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed;
	private boolean on;
	private double radius;
	private String color;
	
	// A no-argument constructor the creates a default fan */
	public Fan() {
			speed = STOPPED;
			on = false;
			radius = 6.0;
			color = "white";
	} // End no argument constructor
	
	/* A  argumnet constructor with four parameters 
	 * (Speed, on/off, radius and color) 
	 */
	public Fan (int speed, boolean on, double radius, String color) {
		this.speed = speed;
		this.on = on;
		this.radius = radius;
		this.color = color;
	} // End argument constructor
	
	// Accessor and mutator methods for all the data fields */
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public boolean isOn() {
		return on;
	}
	
	public void setOn(boolean off) {
		this.on = off;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	// End of Accessor and mutator methods
	
	/* Override toString that displays the results if the fan is on or off
	 * If the fan is on it displays speed, color and radius
	 * If the fan is off it displays color, radius and the fan is off
	 */
	public String toString() {
		if(on == true)
		{
		return "The Fan is on " + " and the speed is set to " + speed + " with a radius of " + radius + " and its color is " + color + ".";
		}
		else
		{
			return "The fan " + "color is " + color + " with a radius of " + radius + " the fan is off";
		}
	} // End  String toString
} // End Class FanApp