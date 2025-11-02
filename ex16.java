import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[4][4];

        System.out.println("Digite os elementos da matriz A 4x4:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++)
                A[i][j] = 0;

        System.out.println("\nMatriz triangular inferior:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++)
                System.out.print(A[i][j] + "\t");
            System.out.println();
        }

        sc.close();
    }
}
