package sistema_loja;

class Cliente {
    
    // Atributos
    protected String statusCliente;
    protected String nomeCliente;
    protected String setorInteresse;
    private int statusCesta;
    private int numeroCliente;
    
    private int qtdPecasCompradas;
    private float valorCompra;
    private float valorTotal;
    private int qtdPecasTotal;
    
    // Construtor
    public Cliente() {
        this.qtdPecasCompradas = 0;
        this.valorCompra = 0;
        this.valorTotal = 0;
        this.qtdPecasTotal = 0;
    }
    
    // Métodos
    public void setStatusCesta(int statusCesta) {
        this.statusCesta = statusCesta;
    }
    
    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }
    
    public void setQtdPecas(int qtdPecasCompradas) {
        this.qtdPecasCompradas = qtdPecasCompradas;
    }
    
    public void cadastro(String statusCliente, String setorInteresse, String nomeCliente, int numeroCliente) {
        this.statusCliente = statusCliente;
        this.setorInteresse = setorInteresse;
        this.nomeCliente = nomeCliente;
        this.numeroCliente = numeroCliente;
    }
    
    public void atendimento(String statusCliente) {
        this.statusCliente = statusCliente;
    }
    
    public void cesta() {
        if (statusCesta == 1) {
            valorTotal = valorTotal + valorCompra;
            qtdPecasTotal = qtdPecasTotal + qtdPecasCompradas;
        }
        else {
            valorTotal = valorTotal - valorCompra;
            qtdPecasTotal = qtdPecasTotal - qtdPecasCompradas;
        }
    }

    public String gerarComprovante() {
        return "\nSetor de Interesse: " + setorInteresse + "\nNome da cliente: " + nomeCliente + "\nNúmero da cliente: " + numeroCliente + "\nValor total: " + valorTotal + "\nQuantidade de peças compradas: " + qtdPecasTotal + "\n";
    }
}