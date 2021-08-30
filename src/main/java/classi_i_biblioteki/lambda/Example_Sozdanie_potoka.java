package classi_i_biblioteki.lambda;

public class Example_Sozdanie_potoka {
    public static void main(String[] args) {

        // Пример потока без лямбда
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1 запущен ...");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();

        // Пример потока с лямбда
        Runnable r2 = () -> {
            System.out.println("Thread2 запущен ...");
        };
        Thread t2 = new Thread(r2);
        t2.start();

    }

}
