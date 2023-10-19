package homeworkweek6;

import java.util.Scanner;

public class question14 {

    public static void main(String [] args){
        /*This code print 2 numbers and compair it.  */
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        System.out.println("input first integer:");
        number1 = input.nextInt();
        System.out.println("input second integer:");
        number2 = input.nextInt();
        if ( number1 == number2)
            System.out.println(number1 + "==" + number2);
        if ( number1 > number2)
            System.out.println(number1 + ">" + number2);
        if ( number1 < number2)
            System.out.println(number1 + "<" + number2);
        if ( number1 <= number2)
            System.out.println(number1 + "<=" + number2);
        if ( number1 >= number2)
            System.out.println(number1 + ">=" + number2);
        if ( number1 != number2)
            System.out.println(number1 + "!=" + number2);


    }
}
