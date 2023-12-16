import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.print("Digite a dimensão: ");
        Scanner scanner = new Scanner(System.in);

        int dimensao = scanner.nextInt();
        char [][] matriz = new char[dimensao][dimensao];

        for (int i = 0; i <= dimensao; i++) {

            for (int j = i; j <= dimensao - 1; j++) {

                System.out.print("-");

            }

            for (int j = 0; j <= 2 * i + i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}