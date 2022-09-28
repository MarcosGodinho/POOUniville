import java.util.ArrayList;

public class fifo {
    public static void main(String[] args) {

        ArrayList<Integer> processo = new ArrayList<Integer>();
        processo.add(2);
        processo.add(-3);
        processo.add(4);
        processo.add(-5);

        ArrayList<Integer> executando = new ArrayList<Integer>();
        ArrayList<Integer> finalizados = new ArrayList<Integer>();

        for(int i = 0; i < processo.size(); i++) {

            int n = processo.get(i);
            executando.add(n);
            System.out.println("Executando: " + processo.get(i));
            while(n > 0) {
                System.out.print(n + " ");
                n--;
                executando.set(0, n);
            }
            while(n < 0) {
                System.out.print(n + " ");
                n++;
                executando.set(0, n);
            }
            System.out.println();
            finalizados.add(processo.get(i));
        }
        processo.clear();
        executando.clear();
        System.out.println("Processo : " + processo);
        System.out.println("Sendo executado: " + executando);
        System.out.println("Finalizados:" + finalizados);

    }
}
