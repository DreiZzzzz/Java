/*
 * 	TODO: If you have any imports to make, place them here.
 */
import java.util.Scanner;

public class ArrayPractice {
    /*
     * 	TODO: Supply the needed methods here.
     */

    /*
     * 	Do NOT modify the main method.
     */
    public static void main(String[] args) {
        ArrayPractice ap = new ArrayPractice();

        double[] numbers = ap.getNumbers();

        System.out.println("Avg: " + ap.computeAvg(numbers));
        System.out.println("Std: " + ap.computeStd(numbers));

    }

    public double[] getNumbers(){
        Scanner scanner = new Scanner(System.in);

        // asks for input
        int inputSize = scanner.nextInt();
        System.out.println("------------");

        double[] numbers = new double[inputSize];

        for (int i = 0; i < inputSize; i++) {
            numbers[i] = scanner.nextDouble();
        }

        System.out.println("------------");

        // return an array of double values
        return numbers;
    }

    public double computeAvg(double[] numbers) {
        double sum = 0.0;
        double average = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        average = sum / numbers.length;

        // return the average of the double values
        return average;
    }

    public double computeStd(double[] numbers) {
        double standardDeviation = 0.0;
        double average = computeAvg(numbers);

        System.out.println("Test average: " + average);

        for (int i = 0; i < numbers.length; i++) {
            standardDeviation += Math.pow(numbers[i]-average, 2);
        }

        standardDeviation /= numbers.length;

        return Math.sqrt(standardDeviation);
    }
}