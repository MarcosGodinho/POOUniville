import java.util.ArrayList;
import java.util.Collections;

public class sjf {
    public static void main(String[] args) {

        ArrayList<Integer> executando = new ArrayList<Integer>();
        ArrayList<Integer> finalizados = new ArrayList<Integer>();
        ArrayList<Integer> processo = new ArrayList<Integer>();
        ArrayList<Integer> processoPositivo = new ArrayList<Integer>();

        processo.add(2);
        processo.add(-1);
        processo.add(7);
        processo.add(-3);


        for(int i = 0; i < processo.size(); i++) {
            if(processo.get(i) < 0) {
                processoPositivo.add(processo.get(i) * - 1);
            } else {
                processoPositivo.add(processo.get(i));
            }
        }

        Collections.sort(processoPositivo, Collections.reverseOrder());
        System.out.println(processoPositivo);
        System.out.println(processo);

        for(int i = 0; i < processoPositivo.size(); i++) {

            int n = processoPositivo.get(i);
            executando.add(n);
            System.out.println("Executando: " + processoPositivo.get(i));
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
