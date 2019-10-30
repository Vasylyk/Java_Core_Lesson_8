package task3;

import java.util.Scanner;

public class Addition {
    private double n1;
    private double n2;
    private double sum;
    Scanner sc = new Scanner(System.in);
    double addition(){
        System.out.println("Write 2 numbers");
        n1=sc.nextDouble();
        n2=sc.nextDouble();
        sum=n1+n2;
        System.out.println("Sum of this numbers = "+sum);
        return sum;
    }
}
