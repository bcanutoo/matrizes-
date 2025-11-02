import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        int[][] transposta = new int[3][3];

        System.out.println("Digite os elementos da matriz A 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                transposta[j][i] = A[i][j];

        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(transposta[i][j] + "\t");
            System.out.println();
        }

        sc.close();
    }
}
