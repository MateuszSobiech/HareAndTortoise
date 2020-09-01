public class Main {
    public static void main(String[] args) {
        int[] nums = {3, 1, 3, 4, 2};

        for (int item: nums) {

            int isTheSame = 0;
            for (int secoundItem: nums) {
                if (item == secoundItem) {
                    isTheSame++;
                }
                if (isTheSame == 2)
                {
                    System.out.println(item);
                    break;
                }
            }
            break;
        }
    }
}
