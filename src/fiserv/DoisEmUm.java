package fiserv;

public class DoisEmUm implements Estoque{

    @Override
    public Integer calcular(Integer param) {
        return param * 2;
    }
}
