package exercicio06;

import java.util.Scanner;

public class TestePerfilDeSaude {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu peso em Kg:");
        double peso = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite sua altura em Metro: ");
        double altura = Double.parseDouble(scanner.nextLine());

        PerfilDeSaude perfilDeSaude = new PerfilDeSaude("Camila", "Artigas",
                "26/05/1983", "Feminino", altura, peso);

        System.out.println(perfilDeSaude.imc());
    }
}
