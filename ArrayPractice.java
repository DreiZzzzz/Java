/* This program is a practice for Arrays
 *
 * De Jesus, Andrei Zarmin D.
 * CCPROG3 - S22
 *
 */


/*
 * 	TODO: If you have any imports to make, place them here.
 */
import java.util.Scanner;


public class ArrayPractice {

	/*	@param sc - an object from the scanner class
	 *  @param nSize - the variable that holds the number of inputs
	 *  @param dNumbers - 
	 *  @param i - the variable use for indexing
	 *
	 * 	@return the array of double values
	 */
	public double[] getNumbers(){
		Scanner sc = new Scanner(System.in); // instantiation of an object 

		System.out.print("\nNUMBER OF INPUTS: "); // asks user for number of inputs
		int nSize = sc.nextInt(); // scans and store user input to nSize(int) variable

		System.out.println("----------"); // prints a newline

		double[] dNumbers = new double[nSize]; // instantiation of array of doubles with nSize

		for (int i = 0; i < nSize; i++) {
			dNumbers[i] = sc.nextDouble(); // scans and store input to dNumbers[i] variable, with i incrementing every loop
		}

		System.out.println("----------"); // prints a newline

		return dNumbers;
	}


	/*
	 * @param dNumbers - an array that holds the number inputs of the user
	 * @param dSum - the variable that holds the sum of the numbers
	 * @param i - the variable use for indexing
	 *
	 * @return the average of the double numbers
	 */
	public double computeAvg(double[] dNumbers) {
		double dSum = 0.0; // declaration and initialization of 0.0 to the variable dSum

		for (int i = 0; i < dNumbers.length; i++) {
			dSum += dNumbers[i]; // adding values of dNumbers[i] which increment everyloop and store in to variable dSum
		}

		return dSum / dNumbers.length; 
	}


	/*
	 * @computeStd - the method that computes for the Standard Deviation
	 *
	 * @param dNumbers - an array that holds the number inputs of the user  
	 * @param dAve - the variable that holds the average of the numbers
	 * @param dSum - the variable that holds the sum of the numbers
	 * @param i - the variable use for indexing
	 *
	 * @return standard deviation(square root of (dsum/dNumbers.length)
	 */
	public double computeStd(double[] dNumbers) {
		double dAve;
		double dSum = 0.0; // declaration and initialization of 0.0 to the variable dSum

		dAve = computeAvg(dNumbers); // call for the computeAvg method and store it in dAve variable

		for (int i = 0; i < dNumbers.length; i++) { // dNumbers.length == array size
			dSum += Math.pow(dNumbers[i] - dAve, 2);
		}

		return Math.sqrt(dSum / dNumbers.length); 
	}


	/*
	 * The driver method of the program
	 */
	public static void main(String[] args) {
		ArrayPractice ap = new ArrayPractice(); // 

		double[] numbers = ap.getNumbers(); // calls for the getNumbers() method and initialize the numbers array;

		System.out.println("Avg: " + ap.computeAvg(numbers)); // prints the average of the number inputs
		System.out.println("Std: " + ap.computeStd(numbers)); // prints the standard deviation of the number inputs
	}
}