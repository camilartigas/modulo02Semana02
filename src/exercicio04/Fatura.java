package exercicio04;

public class Fatura {
    private String numero;
    private String decricao;
    private int quantidadeItens;
    private double precoUnitario;

    public Fatura(String numero, String descricao, int quantidadeItens, double precoUnitario){
        this.numero = numero;
        this.decricao = descricao;
        setQuantidadeItens(quantidadeItens);
        setPrecoUnitario(precoUnitario);
    }

    public String getNumero() {

        return numero;
    }

    public void setNumero(String numero) {

        this.numero = numero;
    }

    public String getDecricao() {

        return decricao;
    }

    public void setDecricao(String decricao) {

        this.decricao = decricao;
    }

    public int getQuantidadeItens() {

        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens < 0 ? 0 : quantidadeItens; // ou this.quantidadeItens = Math.max(quantidadeItens, 0)
    }

    public double getPrecoUnitario() {

        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {

        this.precoUnitario = Math.max(precoUnitario,0);
    }

    public double getValorFatura(){
        return this.quantidadeItens * this.precoUnitario;
    }
}
