package classi_i_biblioteki.lambda.metanit;

public class Example_Link_na_metod_kak_parametr_merodov {
    public static void main(String[] args) {

        int[] nums = {-5,-4,-3,-2,-1,0,1,2,3,4,5};
        System.out.println(sum(nums,ExpressionHelper::isEven));

        Expression2 expression2 = ExpressionHelper::isPositive;
        System.out.println(sum(nums,expression2));
    }
    private static int sum(int[] numbers, Expression2 func){
        int result = 0;
        for (int i:numbers){
            if (func.isEqual(i))
                result +=i;
        }
        return result;
    }
}

interface Expression2 {
    boolean isEqual(int n);
}

class ExpressionHelper {
    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static boolean isPositive(int n) {
        return n > 0;
    }
}
