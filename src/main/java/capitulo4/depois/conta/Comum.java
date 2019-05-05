package capitulo4.depois.conta;

import capitulo4.depois.GerenciadorSaldo;
import lombok.Getter;

public class Comum {

    @Getter
    private GerenciadorSaldo gerenciador;

    public Comum() {
        this.gerenciador = new GerenciadorSaldo();
    }

    public void saca(double valor) {
        this.gerenciador.saca(valor + 10);
    }

    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    public void rende() {
        this.gerenciador.rende(1);
    }

    public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }
}
