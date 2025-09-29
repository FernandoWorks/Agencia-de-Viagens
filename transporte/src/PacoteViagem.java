package com.mycompany.transporte;

public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int qtdDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int qtdDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.qtdDias = qtdDias;
    }

    // valor total da hospedagem = valor da diária * quantidade de dias
    public double calcularTotalHospedagem() {
        return hospedagem.getValorDiaria() * qtdDias;
    }

    // aplica margem de lucro (em %) sobre um valor
    public double calcularLucro(double valor, double margem) {
        return valor + (valor * margem / 100);
    }

    // calcula o valor total do pacote
    public double calcularTotalPacote(double margem, double taxas) {
        double base = transporte.getValor() + calcularTotalHospedagem();
        double comLucro = calcularLucro(base, margem);
        return comLucro + taxas;
    }

    public String getDestino() {
        return destino;
    }
}
