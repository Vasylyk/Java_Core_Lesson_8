package task1;

import java.util.Scanner;

public class Parity {
    Scanner sc = new Scanner(System.in);
    private String month;
    private Month[]arr = Month.values();
    void evenNumberOfDays(){
        System.out.println();
        System.out.println("Months that have even number of days: ");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].days%2==0){
                System.out.print(arr[i].name()+" ");
            }
        }
    }
    void oddNumberOfDays(){
        System.out.println();
        System.out.println("Months that have odd number of days: ");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].days%2==1){
                System.out.print(arr[i].name()+" ");
            }
        }
    }
    void parity(){
        System.out.println();
        System.out.println("Write name of month");
        month=sc.nextLine();
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].name().equalsIgnoreCase(month)){
                if (arr[i].days%2==0){
                    System.out.println(arr[i].name()+" has even number of days");
                } else {
                    System.out.println(arr[i].name()+" has odd number of days");
                }
            }
        }
    }
}
