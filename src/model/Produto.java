package model;
public class Produto {
    
    private int id;
    private String categoria;
    private String descricao;
    private String unidade;
    private int quantidade;
    private double valor;
    private double valorTotal;

    public Produto(int id, String categoria, String descricao, String unidade, int quantidade, double valor, double valorTotal) {
        this.id = id;
        this.categoria = categoria;
        this.descricao = descricao;
        this.unidade = unidade;
        this.quantidade = quantidade;
        this.valor = valor;
        this.valorTotal = valorTotal;
    }

    public Produto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    
    
    
    
    
    
}
