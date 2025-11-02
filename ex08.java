import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int somaPrincipal = 0, somaSecundaria = 0;

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][2 - i];
        }

        System.out.println("Soma diagonal principal: " + somaPrincipal);
        System.out.println("Soma diagonal secundária: " + somaSecundaria);
        sc.close();
    }
}
