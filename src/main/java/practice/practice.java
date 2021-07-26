package practice;

public class practice {
    public static void main(String[] args) {
        int sum = 0;
        int znak = 1;

        for (int i = 1; i <= 6; i ++) {
            sum += znak*1;
            znak*= i;

            System.out.println(sum);
        }

        System.out.println(sum);

    }
}
