public class ProcessoCallCenter implements Runnable{
    FilaCallCenter fila;

    public ProcessoCallCenter(FilaCallCenter f) {
        fila = f;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + 
        " entrou na fila para atendimento");
        
        //fila.atenderClienteSemControle();
        fila.atenderClienteComControle();
    }

}
