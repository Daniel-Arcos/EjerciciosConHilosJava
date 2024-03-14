package Ejercicio2;

public class ProgramaPrincipal {

    public static void main(String[] args) {
        Thread hiloHola = new Thread(new Runnable() {

            @Override
            public void run() {
                while (true) {
                    System.out.print("Hola ");
                    try {
                         Thread.sleep(200);
                    } catch (InterruptedException e) {
                         e.printStackTrace();
                    }   
                }
            }
            
        });
    
        Thread hiloMundo = new Thread(new Runnable() {
    
            @Override
            public void run() {
                while (true) {
                    System.out.print("Mundo ");
                    try {
                         Thread.sleep(200);
                    } catch (InterruptedException e) {
                         e.printStackTrace();
                    }   
                }
            }
            
        });
    
        hiloHola.start();
        hiloMundo.start();   
    }
}