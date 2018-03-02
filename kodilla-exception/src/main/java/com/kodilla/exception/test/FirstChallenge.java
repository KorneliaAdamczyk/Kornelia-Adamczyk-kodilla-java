package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b){

        try {
            return a / b;
        }
           catch (ArithmeticException e){

               System.out.println("Divider can't be zero!");

        } finally{
            System.out.println("Finally ");
        }

return 0;
}
    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        System.out.println(result);

    }
}
