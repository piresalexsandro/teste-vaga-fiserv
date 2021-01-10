package fiserv;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {

        RelatorioAlmoxarifado relatorioAlmoxarifado = new RelatorioAlmoxarifado();
        Integer resultado  = relatorioAlmoxarifado.calcularTotal(Arrays.asList(-1, 5, 3, 4, -1));
//      5 + 3 + 4 + (-1) = 11 * 50 = 550
        System.out.println("Total de Canetas no Estoque Metodo Corrigido..: " + resultado);

        resultado  = relatorioAlmoxarifado.calcularTotalRefatorado(Arrays.asList(-1, 5, 3, 4, -1));
//      5 + 3 + 4 + (-1) = 11 * 50 = 550
        System.out.println("Total de Canetas no Estoque Metodo Refatorado.: " + resultado);

    }
}
