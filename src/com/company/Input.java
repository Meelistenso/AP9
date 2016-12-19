package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Input {
    static String alphabet="qwertyuiopasdfghjklzxcvbnm";

    static int RandomInt(int length){
        Random rand = new Random();
        return rand.nextInt(length);
    }

    static String RandomString(int length){
        Random rand = new Random();
        StringBuilder res = new StringBuilder();
        for (int i=0;i<length;i++)
        {
            res.append(alphabet.charAt(rand.nextInt(alphabet.length())));
        }
        return res.toString();
    }

    static int IntExp2(String name){
        int res = (int)Math.pow(2,Int(name));
        System.out.println("Число "+ res);
        return res;
    }
        static int Int(String name) {
            while (true) try {
                System.out.printf("Введите %s: ", name);
                Scanner sc = new Scanner(System.in);
                return sc.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка, введите целое число.");
            }
        }

        static double Double(String name) {
            while (true) try {
                System.out.printf("Введите %s: ", name);
                Scanner sc = new Scanner(System.in);
                return sc.nextDouble();
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка, введите число.");
            }
        }

        static String String(String name) {
            System.out.printf("Введите %s: ", name);
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }

        static boolean Bool(String name){
            while (true) try {
                System.out.printf(name);
                Scanner sc = new Scanner(System.in);
                String b = sc.next();
                if (b.equalsIgnoreCase("да")) return true;
                else if (b.equalsIgnoreCase("нет")) return false;
                else throw new InputMismatchException();
            } catch (InputMismatchException ex) {
                System.out.println("Ошибка, введите да или нет.");
            }
        }
    }

