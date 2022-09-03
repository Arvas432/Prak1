package prak11;

import java.util.Arrays;

public class prak1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.print("Массив: ");
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for(int i = 0; i< nums.length; i++)
        {
            sum += nums[i];
        }
        System.out.print("(цикл for) сумма элементов = ");
        System.out.println(sum);
        sum = 0;
        int counter = 0;
        while(counter < nums.length)
        {
            sum += nums[counter];
            counter ++;
        }
        System.out.print("(цикл while) сумма элементов = ");
        System.out.println(sum);
        sum = 0;
        counter = 0;
        do
        {
            sum += nums[counter];
            counter ++;
        }while(counter < nums.length);
        System.out.print("(цикл do while) сумма элементов = ");
        System.out.println(sum);



    }
}
