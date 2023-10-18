package exercicio02;

public class PessoaFisica {
    private String cpf;
    private String rg;
    private String nome;
    private String sobrenome;
    private int idade;

    public PessoaFisica(String cpf) {
        this.setCpf(cpf);
    }

    private boolean validaCpf(String cpf){
        // Verifica se o CPF tem 11 dígitos
        return cpf.length() == 11;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (validaCpf(cpf)){
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido");
        }

    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
