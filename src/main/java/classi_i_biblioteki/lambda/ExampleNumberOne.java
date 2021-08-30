package classi_i_biblioteki.lambda;

interface Drawable {
    public void draw();
}

public class ExampleNumberOne {
    public static void main(String[] args) {
        int with = 10;

        // без лямбды, реализация Drawable с использованием анонимного класса
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + with);
            }
        };
        d.draw();

        // с лямбдой
        Drawable d2 = () ->{
            System.out.println("Drawing "+with );
        };
        d2.draw();

    }
}
