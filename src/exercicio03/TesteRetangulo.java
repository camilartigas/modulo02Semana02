package exercicio03;

import java.util.Scanner;

public class TesteRetangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor para a largura: ");
        double largura = scanner.nextDouble();

        System.out.println("Digite um valor para o comprimento: ");
        double comprimento = scanner.nextDouble();

        Retangulo retangulo = new Retangulo();
        retangulo.setComprimento(comprimento);
        retangulo.setLargura(largura);

        System.out.printf("Perímetro: %.2f%n", retangulo.perimetro());
        System.out.printf("Área: %.2f%n", retangulo.area());

        scanner.close();
    }
}
