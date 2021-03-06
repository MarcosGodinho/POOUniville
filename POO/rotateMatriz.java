import java.util.Scanner;
public class rotateMatriz {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o tamanho da matriz NxN:");
        int tamanhoMatriz = leitor.nextInt();

        int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];
        criarMatriz(matriz, tamanhoMatriz);

        System.out.println("------ Matriz original ------");
        printMatriz(matriz);

        System.out.println("Quantos graus?");
        System.out.println("1 - 0 graus \n2 - 90 graus \n3 - 180 graus \n4 - 270 graus \n5 - 360 graus");
        int grausGirar = leitor.nextInt();

        while(grausGirar > 1){
            girarMatriz(matriz, tamanhoMatriz);
            grausGirar = grausGirar - 1;
        }

        System.out.println("------ Matriz nova ------");
        printMatriz(matriz);

        leitor.close();
}

    public static void girarMatriz(int[][] matriz, int n){
        int matriz2[][] = new int[n][n];

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                matriz2[j][matriz2[j].length - 1 - i] = matriz[i][j];
            }
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                matriz[i][j] = matriz2[i][j];
            }
        }
    }

    public static void printMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print(" {" + matriz[i][j] + "} ");
            }
            System.out.println();    
        }
        System.out.println();
    }

    public static void criarMatriz(int[][] matriz,int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int aleatorioN =(int) (Math.random() * 100);
                if(aleatorioN < 10){
                    matriz[i][j]= aleatorioN + 10;
                }else{
                    matriz[i][j]= aleatorioN;
                }
            }
        }
    }
}
