package sintaksis.Arrays;

public class Perebor_mnogomernix_massivov_v_tsikle {
    public static void main(String[] args) {
        int[][] nums = new int[][]
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9}
                };
        // Вывод многомерных массив по указанному индексу
        System.out.println(nums[0][1]);
        // Вывод многомерных массив по циклу
        for (int i=0;i<nums.length;i++){
            for (int j=0;j<nums.length; j++){
                System.out.println(nums[i][j]);
            }
        }
    }
}
