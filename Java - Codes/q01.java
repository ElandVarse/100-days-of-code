package provaJava;
/**
 * @author André Naldo Alves Pereira
 * 1) Faça um programa que mostre o menu de opções a seguir, receba a opção do 
 * usuário e de acordo com ela os dados necessários para efetuar a operação 
 * escolhida quantas vezes o usuário desejar, ou seja, ao final de cada operação
 * menu deve ser msotrado novamente para que o usuário escolha novamente as opções
 * ou, caso não queira, escolha sair e o programa deve ser encerrado. Tanto a 
 * potência quanto o fatorial devem ser implementados com o laço for. O programa
 * deve fazer a consistencia dos dados, ou seja, aceitar apenas valores maiores 
 * que 0 para os cálculos e não aceitar opções inválidas no menu.
 * 
 * Menu de opções: 
 * 1 - Ler 3 números e apresentá-los em ordem crescente.
 * 2 - Ler 3 números e apresentá-los em ordem decrescente.
 * 3 - Ler 3 números e apresentá-los com o maior número no meio.
 */
import java.util.Scanner;
public class q01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int n1, n2, n3, aux, menu;
        // do while serve pra repetir o código toda vez que for executado;
        do {
            System.out.println("Menu de Opções \n 1 - Ordem Crescente \n " +
                "2 - Ordem Descrescente \n 3 - Maior no meio \n " +
                "0 - Sair");
            menu = leia.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Informe os números desejados usando a tecla Enter. :)");
                    n1 = leia.nextInt();
                    n2 = leia.nextInt();
                    n3 = leia.nextInt();
                    //Checa se o número é maior que 0, se não for, fecha o programa;
                    if (n1 < 1 || n2 < 1 || n3 < 1) {
                        System.out.println("Desculpe, mas não pode valor menor que 0");
                        System.exit(0);
                    }
                    //Lógica para ordem crescente;
                    if (n1 > n2) {
                        aux = n1;
                        n1 = n2;
                        n2 = aux;
                    }
                    if (n2 > n3) {
                        aux = n2;
                        n2 = n3;
                        n3 = aux;
                    }
                    if (n1 > n2) {
                        aux = n1;
                        n1 = n2;
                        n2 = aux;
                    }
                    //Resultado
                    System.out.println("\nResultado: ");
                    System.out.println(n1);
                    System.out.println(n2);
                    System.out.println(n3);
                    break;
                    //Fim da opção crescente / Começo da decrescente:
                case 2:
                    System.out.println("Informe os números desejados usando a tecla Enter. :)");
                    n1 = leia.nextInt();
                    n2 = leia.nextInt();
                    n3 = leia.nextInt();
                    //Checa se o número é maior que 0, se não for, fecha o programa;
                    if (n1 < 1 || n2 < 1 || n3 < 1) {
                        System.out.println("Desculpe, mas não pode valor menor que 0");
                        System.exit(0);
                    }
                    //Lógica para ordem decrescente, basicamente inverti o sinal;
                    if (n1 < n2) {
                        aux = n1;
                        n1 = n2;
                        n2 = aux;
                    }
                    if (n2 < n3) {
                        aux = n2;
                        n2 = n3;
                        n3 = aux;
                    }
                    if (n1 < n2) {
                        aux = n1;
                        n1 = n2;
                        n2 = aux;
                    }
                    //Resultado
                    System.out.println("\nResultado: ");
                    System.out.println(n1);
                    System.out.println(n2);
                    System.out.println(n3);
                    break;
                case 3:
                    System.out.println("Informe os números desejados usando a tecla Enter. :)");
                    n1 = leia.nextInt();
                    n2 = leia.nextInt();
                    n3 = leia.nextInt();
                    //Checa se o número é maior que 0, se não for, fecha o programa;
                    if (n1 < 1 || n2 < 1 || n3 < 1) {
                        System.out.println("Desculpe, mas não pode valor menor que 0");
                        System.exit(0);
                    }
                    //Lógica para ordem do maior no meio, usei a lógica da crescente mas mudei a posição no resultado final;
                    if (n1 > n2) {
                        aux = n1;
                        n1 = n2;
                        n2 = aux;
                    }
                    if (n2 > n3) {
                        aux = n2;
                        n2 = n3;
                        n3 = aux;
                    }
                    if (n1 > n2) {
                        aux = n1;
                        n1 = n2;
                        n2 = aux;
                    }
                    //Resultado
                    System.out.println("\nResultado: ");
                    System.out.println(n1);
                    System.out.println(n3);
                    System.out.println(n2);
                    break;
                case 0:
                    System.out.println("Fechou");
                    leia.close();
                    break;
                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        } while (menu != 0);
    }
}