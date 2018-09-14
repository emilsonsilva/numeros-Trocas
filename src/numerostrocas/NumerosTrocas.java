
package numerostrocas;

import java.util.Scanner;

public class NumerosTrocas {

    public static void main(String[] args) {
        int A, B, troca;
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o valor de A:");
        A = leia.nextInt();
        System.out.println("Digite o valor de B:");
        B = leia.nextInt();
        troca = A;
        A = B;
        B = troca;
        System.out.println("O valor da variavel A é:" +A);  
        System.out.println("O valor da variavel B é:" +B);
        
     
    }
    
}
