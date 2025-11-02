import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] A = new int[3][3];
        boolean nula = true;

        System.out.println("Digite os elementos da matriz A 3x3:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if ((A[i][j] = sc.nextInt()) != 0)
                    nula = false;

        System.out.println(nula ? "A matriz é nula." : "A matriz não é nula.");
        sc.close();
    }
}
