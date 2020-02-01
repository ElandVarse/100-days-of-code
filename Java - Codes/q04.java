package provaJava;

/**
 *@author André Naldo Alves Pereira
 * Faça um programa que preencha um primeiro vetor com 10 números inteiros, e um
 * segundo vetor com cinco números inteiros. Após o preenchimento dos vetores 
 * pelo usuário o programa deverá listar dos n úmeros do primeiro vetor com seus
 * respectivos divisores armazenados no segundo vetor indicando suas posições.
 */
import java.util.Scanner;
public class q04 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int vetor[] = new int[10];
        int segVetor[] = new int[5];
        //Os seguintes laços são pra preencher os vetores;
        System.out.println("Digite os números do primeiro vetor");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = leia.nextInt();
        }
        System.out.println("\nDigite números pro segundo vetor");
        for (int i = 0; i < segVetor.length; i++) {
            segVetor[i] = leia.nextInt();
        }
        System.out.println("");
        //Os laços abaixo servem pra verificar se o primeiro vetor tem divisores no segundo;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("");
            System.out.println("Número: " + vetor[i]);
            //Aux é utilizado pra informar a falta de divisores
            int aux = 0;
            for (int j = 0; j < segVetor.length; j++) {
                if (vetor[i] % segVetor[j] == 0) {
                    System.out.println("Divisível por " + segVetor[j] + " na posição " + j);
                } else {
                    //Adiciona +1 ao aux caso não possua divisor, se aux for maior/igual a 5, então não possui divisores;
                    aux++;
                    if (aux >= 5) {
                        System.out.println("Não possui divisores no segundo vetor");
                    }
                }
            }
            //Quando o segundo laço acaba, ele retorna pro primeiro adicionando mais 1;
        }
    }
}