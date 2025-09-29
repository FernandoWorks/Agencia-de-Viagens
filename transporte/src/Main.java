package com.mycompany.transporte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ==== TRANSPORTE ====
        System.out.print("Digite o tipo de transporte: ");
        String tipoTransporte = sc.nextLine();

        System.out.print("Digite o valor do transporte (USD): ");
        double valorTransporte = sc.nextDouble();
        Transporte transporte = new Transporte(tipoTransporte, valorTransporte);

        sc.nextLine(); // limpa buffer

        // ==== HOSPEDAGEM ====
        System.out.print("Digite a descrição da hospedagem: ");
        String descricaoHosp = sc.nextLine();

        System.out.print("Digite o valor da diária (USD): ");
        double valorDiaria = sc.nextDouble();

        Hospedagem hospedagem = new Hospedagem(descricaoHosp, valorDiaria);

        // ==== PACOTE ====
        sc.nextLine(); // limpa buffer
        System.out.print("Digite o destino da viagem: ");
        String destino = sc.nextLine();

        System.out.print("Digite a quantidade de dias: ");
        int qtdDias = sc.nextInt();

        PacoteViagem pacote = new PacoteViagem(transporte, hospedagem, destino, qtdDias);

        // ==== MARGEM E TAXAS ====
        System.out.print("Digite a margem de lucro (%): ");
        double margem = sc.nextDouble();

        System.out.print("Digite o valor das taxas adicionais (USD): ");
        double taxas = sc.nextDouble();

        sc.nextLine(); // limpa buffer

        // ==== VENDA ====
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = sc.nextLine();

        System.out.print("Digite a forma de pagamento: ");
        String formaPagamento = sc.nextLine();

        Venda venda = new Venda(nomeCliente, formaPagamento, pacote);

        // ==== COTAÇÃO DÓLAR ====
        System.out.print("Digite a cotação do dólar em reais (BRL): ");
        double cotacao = sc.nextDouble();

        // ==== RESULTADO ====
        System.out.println("\n=== DETALHES DA VENDA ===");
        venda.mostrarDetalhesVenda(margem, taxas, cotacao);

        sc.close();
    }
}
