package exercicio01;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
    }

//    Método para definir se o ano é bissexto
    private boolean ehBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (mes == 2) {
            if (ehBissexto(ano)) {
                if (dia >= 1 && dia <= 29) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido para fevereiro em ano bissexto. (Dias válidos de 01 à 29)");
                }
            } else {
                if (dia >= 1 && dia <= 28) {
                    this.dia = dia;
                } else {
                    System.out.println("Dia inválido para fevereiro em ano não bissexto. (Dias válidos de 01 à 28)");
                }
            }
        } else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia >= 1 && dia <= 30) {
            this.dia = dia;
        } else if (dia >= 1 && dia <= 31) {
            this.dia = dia;
        } else {
            System.out.println("Dia inválido.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            System.out.println("Mês inválido.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano >= 1900) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido.");
        }
    }

    public void exibirData() {
        System.out.println(dia + "/" + mes + "/" + ano);
    }
}
