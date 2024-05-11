package org.example;

public class Main2 {
    static int year = 2024;
    //1. it is divisible by 400                                 A
    //2. it is divisible by 4 but not divisible by 100          B
    public static void main(String[] args) {
//        Main2 m2 = new Main2();
//        System.out.println(m2.year);
        //check if that year is leap year or not
        if(year%400==0 || year%4==0 && year%100!=0){
            System.out.println(year + " is leap year");
        }else{
            System.out.println(year + " is not leap year");
        }
    }

    public void otherMethod(){
        System.out.println(year);
    }

}
