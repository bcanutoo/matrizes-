import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int cont = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
                if (matriz[i][j] == 0)
                    cont++;
            }
        }

        System.out.println("Quantidade de elementos iguais a zero: " + cont);
        sc.close();
    }
}
