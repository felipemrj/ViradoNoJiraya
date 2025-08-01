package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício13.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício13.domain.ContaSimples;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício13.domain.ImprimeConta;

public class ContaSimplesTest01 {
    public static void main(String[] args) {
        ContaSimples contaUm = new ContaSimples();
        ContaSimples contaDois = new ContaSimples();
        ImprimeConta impressora = new ImprimeConta();

        contaUm.titular = "Felipe";
        contaUm.saldo = 42000;

        contaDois.titular = "Thamyres";
        contaDois.saldo = 900000;

        impressora.exibirConta(contaUm);
        impressora.exibirConta(contaDois);

        contaUm.depositosMultiplos(100, 100, 100, 100);

        impressora.exibirConta(contaUm);

    }
}
