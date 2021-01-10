package fiserv;

import java.util.List;
import java.util.Objects;

public class RelatorioCanetasEmEstoque {

    public Integer calcularTotalRefatorado(List<Integer> listaQuantidadeDeCaixasEntradaOuSaida) {
        final Integer QUANTIDADE_DE_CANETAS_POR_CAIXA = 50;
        Integer totalDeCanetasNoEstoque = 0;

        for (Integer quantasDeCaixaNoEvento : listaQuantidadeDeCaixasEntradaOuSaida) {
            if (Objects.nonNull(quantasDeCaixaNoEvento)) {
                totalDeCanetasNoEstoque = totalDeCanetasNoEstoque + quantasDeCaixaNoEvento * QUANTIDADE_DE_CANETAS_POR_CAIXA;
            }

        }
        return totalDeCanetasNoEstoque;
    }

    public Integer calcularTotal(List listaValores) {

        Integer result;
        int taxa = 0;
        int contador;
        int aux = -1;

        if (listaValores == null) {
            result = null;
        } else {

            int total = 0;
            int[] valoresEmInteiros = new int[listaValores.size()];
            int tamanho = valoresEmInteiros.length;

            for (contador = 1; contador <= tamanho; contador++) {
                int indice = contador - 1;
                Integer temp = (Integer) listaValores.get(indice);
                valoresEmInteiros[indice] = temp.intValue();
            }

            for (contador = 1; contador <= tamanho; contador++) {
                int indice = contador - 1;
                aux = valoresEmInteiros[indice];

                if (aux > 0) {
                    total = total + aux;
                } else if (aux < 0) {
                    total = total + aux;
                } else {
                    total = total + valoresEmInteiros[indice];
                }

                taxa = taxa * aux;
                aux = 50;
                valoresEmInteiros[indice] = '\0';
            }

            result = new Integer(total * aux);
        }
        return result;
    }

}
