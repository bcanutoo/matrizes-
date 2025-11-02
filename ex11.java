import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        boolean diagonal = true;

        System.out.println("Digite os elementos da matriz A 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                A[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (i != j && A[i][j] != 0)
                    diagonal = false;

        System.out.println(diagonal ? "A matriz é diagonal." : "A matriz não é diagonal.");
        sc.close();
    }
}
