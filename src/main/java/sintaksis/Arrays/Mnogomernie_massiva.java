package sintaksis.Arrays;

public class Mnogomernie_massiva {
    public static void main(String[] args) {
        int[][] arr = new int[2][4];
        int n=1;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                arr[i][j] = n;
                n++;
                System.out.println(arr[i][j]);
            }
        }
    }
}
