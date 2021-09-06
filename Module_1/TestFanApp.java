/*
    Liang, Y.D. (2019). Introduction to Java Programming and Data Structures: 
        Comprehensive Version (12th ed.). Pearson Education, Inc.
    Modified by R. Krasso 2021
    Additional modifications by Kylie Gregory 2021
*/ 
public class TestFanApp {
	
	public static void main(String[] args) {
		
		//Creates the default constructor
		Fan fan2 = new Fan();
		System.out.println(fan2.toString());
		//End of the first fan
		
		//Creates the argument constructor based on the set speed
		Fan fan1 = new Fan(3, true, 8, "blue");
		System.out.println(fan1.toString());
		//End of the second fan
		
	}// End Main
} //End Class TestFanApp