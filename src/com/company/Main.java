package com.company;

class Kalkulator {

    public double oblicz(double a, double b, String znak) {
        double rezultat;
        switch(znak) {
            case "/":
                rezultat = a/b;
                break;
            case "*":
                rezultat = a*b;
                break;
            case "+":
                rezultat = a+b;
                break;
            case "-":
                rezultat = a-b;
                break;
            default:
                return 0;
        }
        return rezultat;
    }

}



public class Main {

public static void main(String[]args){

        }


}
