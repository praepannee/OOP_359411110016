package Lab1;

import java.util.Scanner;

public class Exercies {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("กรุณาใส่ค่าฐาน");
        int p =scanner.nextInt();
        System.out.println(p);

        System.out.print("กรุณาใส่ค่าของความสูง");
        int s = scanner.nextInt();
        System.out.println(s);

        System.out.println("พื้นท่ีสามเหลี่ยมเท่ากับ " +(0.5*p*s));

    }
}
