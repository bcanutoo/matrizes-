import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] oposta = new int[3][3];

        System.out.println("Digite os elementos da matriz A 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                oposta[i][j] = -A[i][j];

        System.out.println("\nMatriz oposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(oposta[i][j] + "\t");
            System.out.println();
        }

        sc.close();
    }
}
