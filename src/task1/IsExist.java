package task1;

import java.util.Scanner;

public class IsExist {
    Scanner sc = new Scanner(System.in);
    private String month;
    private Month[]arr = Month.values();

    public String getMonth() {
        return month;
    }

    void isExist(){
        System.out.println("Write name of month");
        month = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i <Month.values().length ; i++) {
            if (month.equalsIgnoreCase(arr[i].name())){
                System.out.println(month+" is exist");
                flag = false;
            }
        }
        if(flag){
            System.out.println(month+" don't exist");
        }
    }
    void sameSeason(){
        System.out.println("Months of this season: ");
        for (int i = 0; i <Month.values().length ; i++) {
            if (month.equalsIgnoreCase(arr[i].name())){
                for (int j = 0; j <Month.values().length ; j++) {
                    if (arr[i].season.equals(arr[j].season)){
                        System.out.print(arr[j].name()+" ");
                    }
                }
            }
        }
        System.out.println();
    }
    void sameDays(){
        System.out.println("Months with same number of days: ");
        boolean flag = true;
        for (int i = 0; i <Month.values().length ; i++) {
            if (month.equalsIgnoreCase(arr[i].name())){
                for (int j = 0; j <Month.values().length ; j++) {
                    if (arr[i].days==arr[j].days){
                        System.out.print(arr[j].name()+" ");
                        flag = false;
                    }
                }
            }
        }
        if (flag){
            System.out.println("does not exist");
        }
        System.out.println();
    }
    void lessDays(){
        System.out.println("Months with less number of days: ");
        boolean flag = true;
        for (int i = 0; i <Month.values().length ; i++) {
            if (month.equalsIgnoreCase(arr[i].name())){
                for (int j = 0; j <Month.values().length ; j++) {
                    if (arr[i].days>arr[j].days){
                        System.out.print(arr[j].name()+" ");
                        flag = false;
                    }
                }
            }
        }
        if (flag){
            System.out.println("does not exist");
        }
        System.out.println();
    }
    void moreDays(){
        System.out.println("Months with more days: ");
        boolean flag = true;
        for (int i = 0; i <Month.values().length ; i++) {
            if (month.equalsIgnoreCase(arr[i].name())){
                for (int j = 0; j <Month.values().length ; j++) {
                    if (arr[i].days<arr[j].days){
                        System.out.print(arr[j].name()+" ");
                        flag = false;
                    }
                }
            }
        }
        if (flag){
            System.out.println("does not exist");
        }
        System.out.println();
    }
    void nextSeason(){
        System.out.println("Next season: ");
        for (int i = 0; i <Month.values().length-3 ; i++) {
            if (month.equalsIgnoreCase(arr[i].name())){
                System.out.println(arr[i+3].season);
            }
        }
        if (month.equalsIgnoreCase(arr[9].name())||month.equalsIgnoreCase(arr[10].name())){
            System.out.println(arr[0].season);
        }
        if (month.equalsIgnoreCase(arr[11].name())){
            System.out.println(arr[2].season);
        }
        System.out.println();
    }
    void previousSeason(){
        System.out.println("Previous season: ");
        if (month.equalsIgnoreCase(arr[0].name())||month.equalsIgnoreCase(arr[1].name())){
            System.out.println(arr[9].season);
        } else if (month.equalsIgnoreCase(arr[2].name())){
            System.out.println(arr[0].season);
        } else {
            for (int i = 0; i <Month.values().length; i++) {
                if (month.equalsIgnoreCase(arr[i].name())){
                    System.out.println(arr[i-3].season);
                }
            }
        }
    }
}
