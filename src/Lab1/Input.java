package Lab1;

import javafx.beans.binding.When;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("What's your name? :");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print("How oid are you? : ");
        int age = scanner1.nextInt();
        System.out.println(age);

        System.out.print("What's your E-maill address");
        String email = scanner.nextLine();
        System.out.println(email);

    }//main
}//class
