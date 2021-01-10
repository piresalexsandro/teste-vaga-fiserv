package fiserv;

import java.math.BigDecimal;
import java.util.List;

abstract class AbstractRelatorioFaturamento implements Relatorio {

    public Integer aplicarTaxas(Integer valorEntrada, List<Integer> taxas) {


        BigDecimal valorAcumulado = converterInteiroParaBigDecimal(valorEntrada);

        for (Integer taxa : taxas) {

            BigDecimal valorEntradaBigDecimal = converterInteiroParaBigDecimal(valorEntrada);
            BigDecimal taxaBigDecimal = converterInteiroParaBigDecimal(taxa);
            taxaBigDecimal = taxaBigDecimal.divide(new BigDecimal("100"));

            if ((taxaBigDecimal.compareTo(BigDecimal.ZERO) == 1)) {
                if ((taxaBigDecimal.compareTo(new BigDecimal("1.00")) == -1) || (taxaBigDecimal.compareTo(new BigDecimal("1.00")) == 0)) {

                    BigDecimal valorTaxa = valorEntradaBigDecimal.multiply(taxaBigDecimal);

                    valorAcumulado = valorAcumulado.add(valorTaxa).setScale(2, BigDecimal.ROUND_HALF_UP);
                }
            }
        }
        return converterBigDecimalParaInteiro(valorAcumulado);
    }

    private BigDecimal converterInteiroParaBigDecimal(Integer valorInteiro) {
        BigDecimal valorBigDecimal = BigDecimal.valueOf(valorInteiro);
        return valorBigDecimal.movePointLeft(2);
    }

    private Integer converterBigDecimalParaInteiro(BigDecimal valorBigDecimal) {
        valorBigDecimal = valorBigDecimal.movePointRight(2);
        return valorBigDecimal.intValueExact();
    }

}
