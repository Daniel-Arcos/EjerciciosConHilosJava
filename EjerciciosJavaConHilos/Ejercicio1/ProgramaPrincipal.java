package Ejercicio1;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Thread hilo1 = new Thread(new Runnable() {

            @Override
            public void run() {
               for (int i = 1; i <= 100; i++) {
                    System.out.println("Hilo uno:" +i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
               }
            }
            
        });

        Thread hilo2 = new Thread(new Runnable() {

            @Override
            public void run() {
               for (int i = 100; i >=1; i--) {
                    System.out.println("Hilo dos: " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
               }
            }
        });

        hilo1.start();
        hilo2.start();
    }
}