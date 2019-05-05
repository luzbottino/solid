package capitulo4.depois;

import capitulo4.depois.conta.Comum;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (Comum conta : contasDoBanco()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<Comum> contasDoBanco() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150));
    }

    private static Comum umaContaCom(double valor) {
        Comum c = new Comum();
        c.deposita(valor);
        return c;
    }
}
