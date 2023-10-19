package homeworkweek6;

import java.util.Scanner;

public class question10 {

    public static void main(String [] args){
        /*  This code takes 2 number and multiples together.*/

        Scanner myScannum = new Scanner(System.in);
        System.out.println("Please Enter first number:");
        int firstnum1 = myScannum.nextInt();
        System.out.println("Please enter second number:");
        int secondnum2 = myScannum.nextInt();
        int prod = firstnum1*secondnum2;
        System.out.println(firstnum1 + " X " + secondnum2 + " = " + prod);
    }
}
