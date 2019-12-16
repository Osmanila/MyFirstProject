package osman;

import java.util.Scanner;

public class Shape {
    public static void main(String[] args){
        int FIVE =5;
        int THREE =3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();
        if (number % FIVE==0 && number % THREE ==0 )
            System.out.println("FUZZBUZZ");
        else if (number % THREE==0)
            System.out.println("BUZZ");
        else if (number % FIVE ==0)
            System.out.println("FUZZ");
        else
            System.out.println(number);


    }
}
