package classi_i_biblioteki.isklyuchenie.proglang;
// block finally try ili catch blockinan keyin istetiledi
// finally blocki joq degende baribir funksiya ahirinda baribir istidi
public class block_finally {
    public static void main(String[] args) {
        int[] array = new int[2];
        try {
            System.out.println("Доступ к третьему элементу: "+array[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Исключение: "+e);
        }finally {
            array[0]=6;
            System.out.println("Значение первого элемента: " + array[0]);
            System.out.println("Оператор finally выполнен.");
        }
    }
}
