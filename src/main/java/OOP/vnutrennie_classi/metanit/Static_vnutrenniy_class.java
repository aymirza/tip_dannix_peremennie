package OOP.vnutrennie_classi.metanit;
/*
Кроме внутренних классов также могут быть статические вложенные классы.
Статические вложенные классы позволяют скрыть некоторую комплексную информацию внутри внешнего класса:
 */
class Math{
    public static class Factorial{
        private int result;
        private int key;

        public Factorial(int number,int x){
            result = number;
            key = x;
        }

        public int getResult() {
            return result;
        }

        public int getKey() {
            return key;
        }
    }
    public static Factorial getFactorial(int x){
        int result=1;
        for(int i=1;i<=x;i++){
            result *= i;
        }
        return new Factorial(result,x);
    }
}
/*
Здесь определен вложенный класс для хранения данных о вычислении факториала.
Основные действия выполняет метод getFactorial, который возвращает объект
вложенного класса. И теперь используем классы в методе main:
 */

public class Static_vnutrenniy_class {
    public static void main(String[] args) {
        Math.Factorial fact = Math.getFactorial(3);
        System.out.println("Факториал числа: "+fact.getKey()+" равен "+fact.getResult());
    }
}
