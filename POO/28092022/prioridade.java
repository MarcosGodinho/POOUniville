import java.util.ArrayList;

public class prioridade {
    public static void main(String[] args) {

        ArrayList<Integer> executando = new ArrayList<Integer>();
        ArrayList<Integer> finalizados = new ArrayList<Integer>();
        ArrayList<Integer> processo = new ArrayList<Integer>();
        ArrayList<Integer> prio = new ArrayList<Integer>();

        processo.add(2);
        prio.add(1);

        processo.add(-3);
        prio.add(4);

        processo.add(4);
        prio.add(2);

        processo.add(-5);
        prio.add(3);

        for(int i = 0; i < processo.size(); i++) {

            int maior = pMaior(prio);
            int n = processo.get(maior);

            executando.add(processo.get(maior));

            System.out.println("Executando: " + executando);

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

            finalizados.add(processo.get(maior));
            prio.set(maior, 0);
            processo.set(maior, 0);
            executando.clear();

            System.out.println();

        }
        
        processo.clear();

        System.out.println("Processo : " + processo);
        System.out.println("Sendo executado: " + executando);
        System.out.println("Finalizados:" + finalizados);

    }
        
    public static int pMaior(ArrayList<Integer> prio) {

        int maior = Integer.MIN_VALUE;
        int indiceMaior = -1;
        for(int j = 0; j < prio.size(); j++) {
            if(maior < prio.get(j)){
                maior = prio.get(j);
                indiceMaior = j;
            }
        }
        return indiceMaior;
    }
}
