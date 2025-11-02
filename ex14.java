import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[4][4];
        boolean triangular = true;

        System.out.println("Digite os elementos da matriz A 4x4:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < 4; i++)
            for (int j = i + 1; j < 4; j++)
                if (A[i][j] != 0)
                    triangular = false;

        System.out.println(triangular ? "A matriz é triangular inferior." : "A matriz não é triangular inferior.");
        sc.close();
    }
}
