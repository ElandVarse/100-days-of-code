package provaJava;
/**
 * @author André Naldo Alves Pereira
 * 2) Faça 2 programas, um para cada estrutura de repetição(do while e while), 
 * que efeture a leitura de um número inderterminado de valores numéricos 
 * inteiros e maiores que 0. O valor 0 encerra a leitura e caso seja digitado um
 * valor negativo deve ser informada uma mensagem de erro e este valor não pode 
 * ser considerado. Ao final da leitura dos números, devem ser apresentados 
 * considerando apenas os números válidos;
 */
import java.util.Scanner;
public class q02wh {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        /*Variáveis e limitantes, tive de usar o maior número possível no auxMenor 
        pra conseguir pegar o menor número da contagem sem usar um array*/
        int n='1', auxSoma = 0, auxMaior = 0, auxMenor = 999999999, somaPar = 0, auxImpar = 0;
        //Float para a média;
        float auxQuant = 0, auxQuantPar = 0;

        System.out.println("Digite números, a contagem acaba quando você digita 0;");
        //Enquanto o número digitado não for 0, então vai continuar pedindo número;
        while(n!=0) {
            n = leia.nextInt();
            //Se o número for negátivo então não é válido;
            if (n < 0) {
                System.out.println("Erro! Valor negativo é inválido.");
            }
            //Checa se os números são válidos;
            if (n > 0) {
                //Soma:
                auxSoma += n;
                //Quantidade:
                auxQuant++;
                //Maior número:
                if (n > auxMaior) {
                    auxMaior = n;
                }
                //Menor número:
                if (n < auxMenor) {
                    auxMenor = n;
                }
                //Números pares:
                if (n % 2 == 0) {
                    somaPar += n;
                    auxQuantPar++;
                }
                //Números ímpares:
                if (n % 2 > 0) {
                    auxImpar++;
                }
            }
        }
        System.out.println("\nResultados: \n");
        System.out.println("Soma dos números: " + auxSoma);
        System.out.println("Quantidade de números digitados: " + (int) auxQuant); //'(int)' serve pra transformar em inteiro;
        System.out.println("Média dos números digitados: " + auxSoma / auxQuant);
        System.out.println("Maior número: " + auxMaior);
        System.out.println("Menor número: " + auxMenor);
        System.out.println("Média dos pares: " + somaPar / auxQuantPar);
        System.out.println("Porcentagem de ímpares: " + (auxImpar / auxQuant) * 100 + '%');
    }
}