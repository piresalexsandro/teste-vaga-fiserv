package fiserv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Campanha {

    public List<Integer> calcularPromocao(List<Integer> valores){
        List<Integer> valoresRetorno = new ArrayList<>();
        DoisEmUm doisEmUm = new DoisEmUm();
        return valores.stream().map(doisEmUm::calcular).collect(Collectors.toList());
    }

    public List<Integer> calcularPromocao(List<Integer> valores, Estoque estoque){
        List<Integer> valoresRetorno = new ArrayList<>();

        valores.forEach(v->{valoresRetorno.add(estoque.calcular(v));});

        return valoresRetorno;
    }

}
