package task1;

import java.util.Scanner;
/**
 * @author Vadym
 * @version 1.2
 * @since 1
 * @exceptions WrongInputConsoleParametersException
 */

public class Parity {
    //out to console months, that have even number of days
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
        //out to console months, that have odd number of days
        System.out.println();
        System.out.println("Months that have odd number of days: ");
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].days%2==1){
                System.out.print(arr[i].name()+" ");
            }
        }
    }
    void parity(){
        //checks if written in console month, is even or odd
        try {
            System.out.println();
            System.out.println("Write name of month");
            month = sc.nextLine();
            for (int i = 0; i < arr.length; i++) {
                boolean flag = true;
                if (arr[i].name().equalsIgnoreCase(month)) {
                    flag = false;
                    if (arr[i].days % 2 == 0) {
                        System.out.println(arr[i].name() + " has even number of days");
                    } else {
                        System.out.println(arr[i].name() + " has odd number of days");
                    }
                }
                if (flag) {
                    System.out.println(month + " don't exist");
                    throw new WrongInputConsoleParametersException();
                }
            }
        }
        catch (WrongInputConsoleParametersException exc){
            System.out.println("This month don't exist, try again...");
            parity();
        }
    }
}
