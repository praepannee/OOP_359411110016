package Lab2;

import java.math.BigInteger;
import  java.util.Scanner;

public class Lab2_2 {
    public  static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("Input Your name : ");
        String o = scanner.nextLine();
        System.out.println("Your name is " +o);

        System.out.print("Input Your Lastname : ");
        String p = scanner.nextLine();
        System.out.println("Hello " +o+ " " +p);


        System.out.print("Please, input Your ID Card : ");
       BigInteger q = scanner1.nextBigInteger();

        System.out.print("Please, input Your address :");
        String r = scanner.nextLine();

        System.out.print("Please, input Your E-mail address : ");
        String s = scanner.nextLine();

        System.out.print("Plese, input Your phone number :");
        BigInteger t = scanner1.nextBigInteger();

        System.out.println("So, your name is " +o+p +", your ID Card number");
        System.out.println(q);
        System.out.println(" , your address at " +r);
        System.out.println(",your E-mail is " +s +"and your phone number is ");
        System.out.println(t);
        System.out.println("Thank you !");
    }
}
