import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<String> clientes = new ArrayList<String>();
        clientes.add("Ana");
        clientes.add("Laura");
        clientes.add("Joao");
        clientes.add("Pedro");
        clientes.add("Angela");
        clientes.add("Edson");

        FilaCallCenter fila = new FilaCallCenter();
        Thread[] thread = new Thread[clientes.size()];
        
        for (int i=0; i<clientes.size(); i++) {
            thread[i] = new Thread(new ProcessoCallCenter(fila));
            thread[i].setName(clientes.get(i));
            thread[i].start();
            try { Thread.sleep (3000); } catch (InterruptedException ex) {}
        }
    }
}
