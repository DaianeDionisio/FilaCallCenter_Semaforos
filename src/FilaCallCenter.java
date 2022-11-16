import java.util.concurrent.Semaphore;

public class FilaCallCenter  {
    
    public void atenderClienteSemControle() {
        System.out.println(Thread.currentThread().getName() + " esta sendo atendido(a)");
        try { Thread.sleep (10000); } catch (InterruptedException ex) {}
        System.out.println(Thread.currentThread().getName() + " ja foi atendido(a)!");
    }

    Semaphore semaforo = new Semaphore(2);

    public void atenderClienteComControle() {
        try {
            semaforo.acquire(); //wait
            System.out.println(Thread.currentThread().getName() + " esta sendo atendido(a)");
            try { Thread.sleep (10000); } catch (InterruptedException ex) {}
        } catch (InterruptedException ex) {}
        finally {
            System.out.println(Thread.currentThread().getName() + " ja foi atendido(a)!");
            semaforo.release(); //signal
        }
    }
}
