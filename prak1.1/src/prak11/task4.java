package prak11;
import java.util.Arrays;
import java.util.Random;
public class task4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 100;
        int[] nums = new int[10];
        for(int i = 0; i<10; i++)
        {
            nums[i] = rand.nextInt(upperbound);
        }
        System.out.print("рандомный массив ");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.print("отсортированный массив ");
        System.out.println(Arrays.toString(nums));

    }
}
