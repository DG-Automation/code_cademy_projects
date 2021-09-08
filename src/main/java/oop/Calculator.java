package oop;

public class Calculator {

    // defining an empty constructor
    public Calculator() {
    }

    // creating a method (behavior) to *add* two int values and return the result
    public int add(int a, int b){
        return a + b;
    }

    // creating a method (behavior) to *subtract* two int values and return the result
    public int subtract(int a, int b){
        return a - b;
    }

    // creating a method (behavior) to *multiply* two int values and return the result
    public int multiply(int a, int b){
        return a * b;
    }

    // creating a method (behavior) to *divide* two int values and return the result
    public int divide(int a, int b){
        return a / b;
    }

    // creating a method (behavior) to *modulo* two int values and return the result
    public int modulo(int a, int b){
        return a % b;
    }

    public static void main(String[] args) {

        // Creating a Calculator object (myCalculator)
        Calculator myCalculator = new Calculator();

        // Using sout to interact with the methods of the Calculator class, via the myCalculator object, to return and print values
        System.out.println(myCalculator.add(5, 7));
        System.out.println(myCalculator.subtract(45, 11));
        System.out.println(myCalculator.multiply(3, 6));
        System.out.println(myCalculator.divide(25, 5));
        System.out.println(myCalculator.modulo(100, 5));
    }

}
