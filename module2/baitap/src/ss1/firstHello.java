package ss1;

import java.util.Scanner;

public class firstHello {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input your name: ");
        String name = sc.nextLine();

        System.out.println("hello " + name);

    }
}