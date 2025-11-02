import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean encontrado = false;
        int x, linha = -1, coluna = -1;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite o valor a buscar: ");
        x = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == x) {
                    encontrado = true;
                    linha = i;
                    coluna = j;
                }
            }
        }

        if (encontrado)
            System.out.printf("Valor %d encontrado em [%d][%d]\n", x, linha, coluna);
        else
            System.out.println("Valor não encontrado.");

        sc.close();
    }
}
