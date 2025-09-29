package com.mycompany.transporte;

public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacote;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacote) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacote = pacote;
    }

    // converte valor em dólar para reais
    public double converterParaReais(double valorDolar, double cotacao) {
        return valorDolar * cotacao;
    }

    // exibe todos os detalhes da venda
    public void mostrarDetalhesVenda(double margem, double taxas, double cotacao) {
        double totalDolar = pacote.calcularTotalPacote(margem, taxas);
        double totalReais = converterParaReais(totalDolar, cotacao);

        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Destino: " + pacote.getDestino());
        System.out.println("Total do Pacote (USD): $" + totalDolar);
        System.out.println("Total do Pacote (BRL): R$" + totalReais);
    }
}
