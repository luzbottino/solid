package capitulo4.depois;

import lombok.Getter;

public class GerenciadorSaldo {

    @Getter
    private double saldo;

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public void saca(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public void rende(double taxa) {
        this.saldo += this.saldo * taxa;
    }
}
