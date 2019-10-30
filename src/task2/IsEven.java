package task2;

import java.util.Scanner;

public class IsEven {
    private double number;
    Scanner sc = new Scanner(System.in);
    void isEven(){
        System.out.println("Write the number");
        number=sc.nextDouble();
        if (number%2==0){
            System.out.println("Number is even");
        } else if (number%2==1){
            System.out.println("Number is odd");
        } else {
            System.out.println("Number is not integer");
        }
    }
}
