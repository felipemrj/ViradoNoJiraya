package bJavaIntrodução.Aula05EstruturasRepeticao;

public class PT03EstruturasRepeticaoBreak {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um dado valor. Por exemplo, 50.
        int maxValue = 50;
        for (int i = 0; i < maxValue; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
    }
}
