package capitulo4.depois.conta;

import capitulo4.depois.GerenciadorSaldo;
import lombok.Getter;

public class Estudante {

    @Getter
    private GerenciadorSaldo gerenciador;
    @Getter
    private double milhas;

    public Estudante(GerenciadorSaldo gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void deposita(double valor) {
        this.deposita(valor);
        this.milhas += (int)valor;
    }
}
