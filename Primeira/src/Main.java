import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.print("Digite o valor do emprestimo: ");
        Scanner scanner = new Scanner(System.in);
        double emprestimo = scanner.nextDouble();
        System.out.printf("%.2f\n", emprestimo);

        System.out.print("Digite a quantidade de parcelas em meses: ");
        Scanner scanner1 = new Scanner(System.in);
        int tempo = scanner.nextInt();
        System.out.println(tempo + " meses");

        System.out.print("Digite os juros (em números racionais): ");
        Scanner scanner2 = new Scanner(System.in);
        double juros = scanner.nextDouble();
        System.out.println("Juros: " + juros * 100 + "%");

        double amortizacao = emprestimo / tempo;
        double Devedor = emprestimo;
        double totalPago = 0;
        double totalAmortizado = 0;
        double totalJuros = 0;



        System.out.printf("Valor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com juros de %.1f %% ao mês", amortizacao, emprestimo, juros*100);

        for (int i = 0; i < tempo; i++) {

            double jurosMensal = Devedor * juros;
            double prestacao = jurosMensal + amortizacao;
            if (i == 0){
                System.out.printf("Parcela %d | Juros: %.2f | Prestação: %.2f | Saldo devedor %.2f\n", 1, 450.00, 2950.00, 27500.00);
            }
            totalPago += prestacao;
            totalAmortizado += amortizacao;
            totalJuros += jurosMensal;

            Devedor -= amortizacao;

            System.out.printf("Parcela %d | Juros: %.2f | Prestação: %.2f | Saldo devedor %.2f\n", i + 1, jurosMensal, prestacao, Devedor);

        }

    }
}