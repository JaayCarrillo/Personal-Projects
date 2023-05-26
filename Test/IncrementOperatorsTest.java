package Test;

import java.util.Scanner;

public class IncrementOperatorsTest {
    public static void main(String[] args) {
        // int number = 0;
        // System.out.println(number);

        /*
        int increment = number + 1;
        int decrement = number +1;
         */
        /*

        int increment = number + 1;
        int decrement = number - 1;
        System.out.println(increment);
        System.out.println(decrement);

         */

        /*
        increment operators : ++
         */

        int num = 0;
        System.out.println(num++); // this will print num @ value 0
        System.out.println(num); // next order of operation will increment ++ 1
        System.out.println("---------------------------------");

        /*
        the same will work with decrementing numbers : --
         */

        int negativeNum = 100;
        System.out.println(negativeNum--); // prints the negative num value
        System.out.println(negativeNum); // next order of operations decrements value by 1

        System.out.println("---------------------");

        /*
        Comparison Operators : < <= > >= == !=
        < ' less than '
        <= 'less than / equal to '
        > 'greater than '
        >= 'greater than / equal to '
        != 'does NOT equal '
         */

        // examples below //
        System.out.println( 10 > 10);
        System.out.println(10 < 10);
        System.out.println( 10 >= 10);
        System.out.println( 10<=10);
        System.out.println( 10 == 10);

        System.out.println("--------------");
        System.out.println("You have to be 21+ to drink");
        int age = 21;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter age: ");
        String input = scanner.nextLine();
        System.out.println(input);

        boolean isAdult = true;
        System.out.println(isAdult);
        System.out.println("Age is above 21+");
        boolean userAge = 21 >= 21;
        /*
        if user enters anything equal to 21 or above 21 than userAge will return 'true;
        so this statement / program works as intended

        if we had a case where the user enters an age that is < 21 years old then
        the program would not work

        right now if we enter an age < 21 the program will still populate that our user
        is still indeed above age

        If we want the program to show that the user is NOT an adult or above 21+ then we
        would want to use an 'if' statement to make that true or false using 'boolean' data types'

         */

        // ------------------------------------------------------------------- //

        /*
        Shorthand Operator
         */
        System.out.println("-----------------------------------------");
        int numberOne = 2;
        int numberTwo = 20;
        numberTwo += numberOne;
        System.out.println(numberTwo);
    }
}
