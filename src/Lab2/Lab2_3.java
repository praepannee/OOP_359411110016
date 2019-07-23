package Lab2;

import  java.util.Scanner;

public class Lab2_3 {
    public  static  void  main (String[] arhs){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input Fasrenheit : ");
        double t = scanner.nextDouble();
        System.out.println(t);

        System.out.println("The Celsius is : " +((5.0/0.9)*(t-32.0)));
    }
}
