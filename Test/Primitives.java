package Test;

public class Primitives {
    /*
    primitive allows us to store simple values
    ex. numbers(int)
    boolean(t/f0
    double(decimal's)
    String (null, "")
     */

    public static void main(String[] args) {
        /*
        Test of primitive values
         */

        /*
        Let's create a person with a simple name , age and date of birth
         */

        System.out.println("My name is: ");
        String name = "Joseph";
        int age = 25;
        String dob = "10/10/1997";
        boolean isMale = true;
        double moneyInBank = 1000.99;

        System.out.println("Name : " + "" + name);
        System.out.println("Age : " + "" + age);
        System.out.println("Date of Birth " + "" + dob);
        System.out.println("Male or Female: " + "" + isMale);
        System.out.println("How much money do you have? " + "" + moneyInBank);

        /*
        you can also add primitive values together or combine then to
        form one solution or answer
         */
        System.out.println("-----------------------------------");
        // add two numbers together //
        int num1 = 100;
        int num2 = 2000;

        System.out.println(num1 + " "+ num2);

        int numTotal = num1 + num2;

        System.out.println(numTotal);
        /*
        you can do this with any primitive value
        such as strings or doubles etc.
         */
        // example of String's

        System.out.println("------------------------------");
        String fName = "Joseph";
        String lName ="Carrillo";
        String favColor= "red";
        boolean blue = false;

        String flName = fName + " "+lName;
        System.out.println(flName + "favorite color: " + " " + favColor);
        System.out.println("Favorite color blue? " + " "+ blue);
    }
}
