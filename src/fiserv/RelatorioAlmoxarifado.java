package fiserv;

import java.util.List;

public class RelatorioAlmoxarifado  implements Relatorio{

    @Override
    public Integer calcularTotal(List<Integer> valores, Integer valor) {
        return null;
    }

    public Integer calcularTotal(List<Integer> listaQuantidadeDeCaixasEntradaOuSaida) {
        RelatorioCanetasEmEstoque emEstoque = new RelatorioCanetasEmEstoque();
        return emEstoque.calcularTotal(listaQuantidadeDeCaixasEntradaOuSaida);
    }

    public Integer calcularTotalRefatorado(List<Integer> listaQuantidadeDeCaixasEntradaOuSaida) {
        RelatorioCanetasEmEstoque emEstoque = new RelatorioCanetasEmEstoque();
        return emEstoque.calcularTotalRefatorado(listaQuantidadeDeCaixasEntradaOuSaida);
    }
}
