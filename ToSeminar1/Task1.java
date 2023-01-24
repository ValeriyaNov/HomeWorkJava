

import java.util.Scanner;

public class Task1{
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите число n = ");
        int n = iScanner.nextInt();
        System.out.printf("Факториал от "+ n + " равен " + FactorialN(n));
        System.out.println();
        System.out.printf("Сумма от 1 до " + n + " равна " + SumToN(n));
        iScanner.close();
    }

    static int SumToN (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }

    static int FactorialN(int n) {
        int factorial = 1;
        for (int i = 1; i<= n; i ++){
            factorial *= i;
        }
        return factorial;
    }
}