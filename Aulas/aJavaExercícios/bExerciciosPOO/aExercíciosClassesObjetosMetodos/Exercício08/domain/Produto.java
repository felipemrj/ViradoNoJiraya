package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício08.domain;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public double valorTotal() {
        return preco * quantidade;
    }
}
