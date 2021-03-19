package sistema_loja;

class Cliente {
    
    // Atributos
    String statusCliente;
    String nomeCliente;
    String setorInteresse;
    private int statusCesta;
    private int numeroCliente;
    private int qtdPecasCompradas;
    private float valorCompra;
    
    float valorTotal;
    int qtdPecasTotal;
    
    // Construtor
    public Cliente(String statusCliente, String setorInteresse, String nomeCliente, int numeroCliente) {
        this.qtdPecasCompradas = 0;
        this.valorCompra = 0;
        this.statusCliente = statusCliente;
        this.setorInteresse = setorInteresse;
        this.nomeCliente = nomeCliente;
        this.numeroCliente = numeroCliente;
    }
    
    // Métodos
    public String getStatusAtendimento() {
        return this.statusCliente;
    }
    
    public void setStatusAtendimento(String statusCliente) {
        this.statusCliente = statusCliente;
    }
    
    public void setValoresCesta(int statusCesta, float valorCompra, int qtdPecasCompradas) {
        this.statusCesta = statusCesta;
        this.valorCompra = valorCompra;
        this.qtdPecasCompradas = qtdPecasCompradas;
    }
    
    public void cesta() {
        if (statusCesta == 1) {
            valorTotal += valorCompra;
            qtdPecasTotal += qtdPecasCompradas;
        }
        else {
            valorTotal -= valorCompra;
            qtdPecasTotal -= qtdPecasCompradas;
        }
    }

    public String gerarComprovante() {
        return "\nSetor de Interesse: " + setorInteresse + "\nNome da cliente: " + nomeCliente + "\nNúmero da cliente: " + numeroCliente + "\nValor total: " + valorTotal + "\nQuantidade de peças compradas: " + qtdPecasTotal + "\n";
    }
}