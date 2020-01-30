package provaJava;
/**
 *@author André Naldo Alves Pereira
 * Faça 2 programas, um para cada estrutura de repetição(do while e while), que 
 * leia um número não determinado de pares de valores [m,n], todos inteiros e 
 * positivos, um par de cada vez, e que calcule e mostre a soma de todos os 
 * números inteiros entre m e n(inclusive). A digitação de pares terminará quando
 * m for maior ou igual a n.
 */
import java.util.Scanner; 
public class q03wh {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        
        int m='1',n='1', aux=0;
        
        System.out.println("Digite uns números aí, o programa termina quando você"
                + " digitar o primeiro maior ou igual ao segundo");
        while(m<=n){
            m = leia.nextInt();
            n = leia.nextInt();
            
            for (int i = m; i <= n; i++) {
                aux+=i;
            }
            System.out.println("");
            System.out.println("Soma dos números entre " + m+ " e " + n +" é " + aux);
            System.out.println("");
            //Pra evitar que o programa some o aux novo com o antigo
            aux=0;
            
        }
        System.out.println("Fim!");
    }
}
