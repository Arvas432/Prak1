package prak11;

import java.util.Scanner;

public class task5
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число ");
        int num = in.nextInt();
        in.close();
        int factorial = 0;
        for(int i = 0; i<= num;i++)
        {
            factorial += i;
        }
        System.out.print("факториал числа: ");
        System.out.println(factorial);
    }
}
