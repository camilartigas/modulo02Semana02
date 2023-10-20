package exercicio05;

import java.util.Scanner;

public class TesteFrequenciaCardiaca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual sua data de nascimento?");
        String dataNascimento = scanner.nextLine();

        FrequenciaCardiaca frequenciaCardiaca = new FrequenciaCardiaca("Camila", "Artigas", dataNascimento);

        System.out.printf("Idade: %d %nfrequencia Card. Máx.:%d %nFreq. Card. Alvo:%.1f-%.1f",
                frequenciaCardiaca.calculaIdade(),
                frequenciaCardiaca.frequenciaCardiacaMaxima(),
                frequenciaCardiaca.frequenciaCardiacaAlvo()[0],
                frequenciaCardiaca.frequenciaCardiacaAlvo()[1]);
    }
}
