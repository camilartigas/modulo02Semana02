package exercicio01;

import java.util.Scanner;

public class TestaData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia:");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês:");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano:");
        int ano = scanner.nextInt();

        Data data = new Data(dia, mes, ano);

        System.out.println("Data inserida:");
        data.exibirData();

    }
}
