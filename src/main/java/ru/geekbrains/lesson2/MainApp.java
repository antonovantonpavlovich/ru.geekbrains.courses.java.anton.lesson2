package ru.geekbrains.lesson2;

public class MainApp {

    public static void main(String[] args) {
        firstEx();
        secondEx();
        thirdEx();
        fourthEx();
        fifthEx ();
    }

    public static void firstEx() {
        int a = 20;
        int b = 8;
        if (a + b >= 10 && a + b <= 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void secondEx() {
        int a = -2;

        if (a >= 0) {
            System.out.println("Число " + a + " положительное!");
        } else {
            System.out.println("Число " + a + " отрицательное!");
        }
    }
    public static void thirdEx(){
        int a = -2;

        if (a <= 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    public static void fourthEx() {
        String a = "peace";
        int b = 10;
        for (int i = 0; i <= b; i++){
         System.out.println(a); }
    }
    public static void fifthEx() {
        int year = 2022;
        if (year > 0) {
            if (year % 4 == 0 && !(year % 100 == 0)) {
                System.out.println("Год " + year + " является високосным!");
            } else if (year > 0 && year % 400 == 0) {
                System.out.println("Год " + year + " является високосным!");
            } else {
                System.out.println("Год " + year + " является не високосным!");
            }
        }
        else {
                System.out.println("Вы ввели отрицательное значение!");
            }
    }
    }




