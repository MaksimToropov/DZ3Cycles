package com.company;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        int i = 1;
        while (i <= 10) {
            System.out.print(i++);
        }
        System.out.println("\n");
        for (int a = 10; a> 0; a--) {
            System.out.print(a);
        }
        System.out.println("\n");

    // Задача 2
        for (int firstFriday = 5; firstFriday < 31; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница," + firstFriday + "-е число. Необходимо подготовить отчет.");
        }

    // Задача 3
        int lastCentury = 1822;
        int nexCentury = 2122;
        for (int wildComet = 0; wildComet <= nexCentury; wildComet +=79) {
            if (wildComet >= lastCentury && wildComet <= nexCentury) {
                System.out.println(wildComet);
            }
        }
    }
}
