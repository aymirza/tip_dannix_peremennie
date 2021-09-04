package classi_i_biblioteki.lambda.metanit;

//Если нам надо вызвать нестатические методы, то в ссылке вместо имени
// класса применяется имя объекта этого класса:

interface Expression3{
    boolean isEqual(int n);
}
class ExpressionHelper2{
    boolean isEven(int n){
        return  n%2 == 0;
    }
}
public class Example_lambda_not_static {
    public static void main(String[] args) {

        int[] nums = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        ExpressionHelper2  exprHelper = new ExpressionHelper2();
        System.out.println(sum(nums, exprHelper::isEven));

    }
    private static int sum (int[] numbers, Expression3 func){
        int result = 0;
        for (int i : numbers){
            if (func.isEqual(i))
                result += i;
        }
        return result;
    }

}
