package practice;

public class practice {
    public static void main(String[] args) {

        int[][] nums = new int[][]{{9, 8, 7}, {6, 5, 4}};
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
            System.out.println();
        }

    }
}
