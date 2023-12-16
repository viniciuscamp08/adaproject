import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Informe a temperatura: ");
        Scanner scanner = new Scanner(System.in);
        double temperatura = scanner.nextDouble();

        System.out.print("Qual a unidade de origem dessa temperatura? [C, K, F] ");
        Scanner scanner1 = new Scanner(System.in);
        char origem = scanner.next().toUpperCase().charAt(0);

        System.out.print("Qual a unidade de destino dessa temperatura? [C, K, F] ");
        Scanner scanner2 = new Scanner(System.in);
        char destino = scanner.next().toUpperCase().charAt(0);

        double C;
        double K;
        double F;

        if (origem == 'C' && destino == 'K'){
            K = 273.15 + temperatura;
            System.out.printf("%.2f C = %.2f K", temperatura, K);
        } else if (origem == 'K' && destino == 'C') {
            C = temperatura - 273.15;
            System.out.printf("%.2f K = %.2f C", temperatura, C);
        } else if (origem == 'C' && destino == 'F') {
            F = (temperatura * 9 / 5) + 32;
            System.out.printf("%.2f C = %.2f F", temperatura, F);
        } else if (origem == 'F' && destino == 'C'){
            C = (temperatura - 32) * 5 / 9;
            System.out.printf("%.2f F = %.2f C", temperatura, C);
        } else if (origem == 'K' && destino == 'F') {
            F = ((temperatura - 273.15) * 9 / 5) + 32;
            System.out.printf("%.2f K = %.2f F", temperatura, F);
        } else if (origem == 'F' && destino == 'K') {
            K = 273.15 + (temperatura - 32) * 5 / 9;
            System.out.printf("%.2f F = %.2f K", temperatura, K);
        } else{
            System.out.println("Inválido");
        }

    }
}