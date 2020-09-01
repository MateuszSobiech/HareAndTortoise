public class Third {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};

        findDuplicate(nums);
    }

    public static void findDuplicate(int[] nums){
        int tortoise = nums[0];
        int hare = nums[0];

        while (true){
            tortoise = nums[tortoise];
            hare = nums[nums[hare]];
            if (tortoise == hare)
                break;
            //tortoise == 3
        }

        int ptr1 = nums[0];
        int ptr2 = tortoise;
        while (ptr1 != ptr2)
        {
            ptr1 = nums[ptr1];
            ptr1 = nums[ptr2];
        }

        System.out.println(ptr1);
    }
}
