import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[4][4];
        boolean simetrica = true;

        System.out.println("Digite os elementos da matriz A 4x4:");
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 4; j++)
                if (A[i][j] != A[j][i])
                    simetrica = false;

        System.out.println(simetrica ? "A matriz é simétrica." : "A matriz não é simétrica.");
        sc.close();
    }
}
