package fiserv;

import java.util.List;

public class RelatorioFaturamentoAVista extends AbstractRelatorioFaturamento implements Relatorio{

    @Override
    public Integer calcularTotal(List<Integer> taxas, Integer valorEntrada) {
        return aplicarTaxas(valorEntrada, taxas);
    }

    @Override
    public Integer aplicarTaxas(Integer valorEntrada, List<Integer> taxas) {
        return super.aplicarTaxas(valorEntrada, taxas);
    }
}
