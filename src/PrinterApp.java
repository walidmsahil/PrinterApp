
public class PrinterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declaring 2 numeric variables and assigning values to them
		int number1 = 10;
		int number2 = 5;
//Declaring variables to find sum, product, difference and quotient
		int multiplication;
		int addition;
		int subtraction;
		double division;
//Print "Printer App" to the console
	System.out.println("Printer App");
//Print “This app is made by:” to the console
	System.out.print("This app is made by:");
//Assign my name to a string variable
	String creator = "Walid Jahin Mazumder";
//Print my name next to last line
	System.out.println(creator);

//Print number1 to console
	System.out.println(number1);
	System.out.println("The value of number1 is " + number1);
//Print number2 to console
	System.out.println("The value of number2 is " + number2);
//Finding the product of the two numbers
	
	multiplication = number1 * number2;
	System.out.println(number1 + "*" + number2 + "=" + multiplication);
//Finding the sum
	
	addition = number1 + number2;
	System.out.println(number1 + "+" + number2 + "=" + addition);
//Finding the difference
	
	subtraction = number1 - number2;
	System.out.println(number1 + "-" + number2 + "=" + subtraction);
//Finding the quotient
	
	division = number1/number2;
	System.out.println(number1 + "/" + number2 + "=" + division);
	
	}		

}
