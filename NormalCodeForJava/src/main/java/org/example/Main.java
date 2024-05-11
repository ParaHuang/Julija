package org.example;

import java.util.Random;

//assertEquals(3>2);
public class Main {
    public static void main(String[] args) {
        //1.data type and define variable
        //8 primitive type:  short int long       float double       char     boolean (true/false)   byte
        //type variableName = value;
        //reference type:String,Main,Scanner,Random
        //Type referenceName = new Type();
        int x = 10;             //default
        double y = 3.14;        //default ,has a wider range
        float z = 3.14f;
        long a = 10000000000L;//0~2^31-1
        boolean b = true;
        char c = 'u';

        String s = "hello";
        Random random = new Random();// create random data,reference type variable has methods
        int d = random.nextInt();//create a big random integer
        int e = random.nextInt(5);  //0~bound-1
        int f = random.nextInt(5,10);   //origin~bound-1
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        //2.operators
        //Math Operators:  +   -    *    /      %
        //Relationship Operators:   >    >=    <    <=     ==     !=
        //Logical Operators:     !    &&     ||
        //assigment Operators:  =   +=   -=   *=   /=   %=


        //&&:the expressions on both side are true, then result is true
//        System.out.println(2+3>4&&1-7>0);
        System.out.println(true&&true);     //true
        System.out.println(true&&false);    //false
        System.out.println(false&&true);    //false
        System.out.println(false&&false);   //false

        //||, any expression is true, then result is true
        System.out.println(true||true);     //true
        System.out.println(true||false);    //true
        System.out.println(false||true);    //true
        System.out.println(false||false);   //false

        int g = 10;
        g+=2;    //g = g+2;
        g-=3;
        g*=2;
        g/=5;
        System.out.println(g);

        //3.decisions
        /*
        if(expression){
            operation1
        }else{
            operations2
        }
        //when the result of expression is true, then execute the operation1
        otherwise, execute operations2

        if(expressionA){
            operation1
        }else if(expressionB){
            operation2
        }else if(expressionC){
            operation3
        }else{
            operations4
        }
         */
        int h = 11;
        if(h%2==0){
            System.out.println(h + " is an even number");
        }else {
            System.out.println(h + " is an odd number");
        }

    }
}