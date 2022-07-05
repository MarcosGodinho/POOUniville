package POO;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Aluno> List = new ArrayList<>();

        System.out.print("Quantidade alunos: ");
        int numeroAlunos = sc.nextInt();

        System.out.print("Quantidade trabalhos/provas: ");
        int numeroTrabalhos = sc.nextInt();

        double notas[] = new double[numeroTrabalhos];

        System.out.println("Pesos diferentes? (S/N) ");
        char resposta = sc.next().charAt(0);

        if(resposta == 'S'){
            for(int z = 0; z < notas.length; z ++){
                System.out.println("Peso do trabalho " + (z + 1) +" em porcentagem: ");
                notas[z] = sc.nextDouble();
                notas[z] = (notas[z] / 100);
            }
        }

        for(int i=1; i <= numeroAlunos; i++){

            System.out.print("Aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();
            double nota,  mediaFinal, soma = 0;

            if(resposta == 'S'){
                for(int k = 0; k<notas.length; k++){
                    System.out.print("Nota trabalho " + (k+1));
                    nota = sc.nextDouble();
                    soma += (nota * notas[k]);
                }
            }
            else{
                for(int k = 0; k<notas.length; k++){
                    System.out.print("Nota trabalho " + (k+1));
                    nota = sc.nextDouble();
                    soma += nota;
                }
                soma = soma / notas.length;
            }
            mediaFinal = soma;
            List.add(new Aluno(nome, mediaFinal));
        }

        for (Aluno aluno : List) {
            System.out.printf(aluno.getNome() + "Media final: " + aluno.getNotaFinal());
        }
        
        sc.close();
    }
}