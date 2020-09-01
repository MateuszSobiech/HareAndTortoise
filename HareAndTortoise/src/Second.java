import java.util.Arrays;
import java.util.Collections;

public class Second {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};

        int previousItem = Integer.MAX_VALUE;

        Arrays.sort(nums);
        for (int item : nums){
            if (item == previousItem)
            {
                System.out.println(item);
            }
            previousItem = item;
        }
    }
}

