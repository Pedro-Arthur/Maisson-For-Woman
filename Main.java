package sistema_loja;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Cadastro na fila
        System.out.print("*** Olá, seja bem-vinda! ***\n");
        System.out.print("Realize o cadastro e aguarde sua vez!\n");
        System.out.print("Para começar, informe o seu setor de interesse (Calçados, Bolsas ou Roupas): ");
        String setorInteresse = input.next();
        System.out.print("Informe seu nome: ");
        String nomeCliente = input.next();
        System.out.print("Informe o número de celular: ");
        int numeroCliente = input.nextInt();
        
        Cliente c1 = new Cliente("EM ESPERA", setorInteresse, nomeCliente, numeroCliente);
        
        // Atendimento
        System.out.print("\nSeu status atual é: " + c1.getStatusAtendimento());
        System.out.print("\nAGUARDE...\n");
        try {
            Thread.sleep(5000);
        }
        catch (InterruptedException ex) {
            System.out.print("Erro ao iniciar o atendimento!");
        }
        
        System.out.print("\nChegou sua vez!");
        c1.setStatusAtendimento("EM ATENDIMENTO");
        System.out.print("\nSeu status atual é: " + c1.getStatusAtendimento());
        
        // Momento das compras
        int sair = 1;
        
        while (sair == 1) {
            System.out.print("\n\nDeseja adicionar ou remover uma compra da cesta? 1(ADD) 2(REM): ");
            int statusCesta = input.nextInt();
            
            System.out.print("Informe o valor da compra: ");
            float valorCompra = input.nextFloat();
            
            System.out.print("Informe a quantidade de peças compradas: ");
            int qtdPecasCompradas = input.nextInt();
            
            c1.setValoresCesta(statusCesta, valorCompra, qtdPecasCompradas);
            
            // Método que realiza as adições e subtrações na cesta.
            c1.cesta();
            
            System.out.print("Digite 1 para continuar alterando ou 2 para finalizar: ");
            sair = input.nextInt();
        }
        
        // Finalizar e gerar comprovante
        System.out.print("\n============ COMPROVANTE ============");
        System.out.print(c1.gerarComprovante());
        System.out.print("=====================================\n");
    }
}