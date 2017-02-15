// juan david villalobo   20142020224
package Singleton;

import java.util.Scanner;
public class Usuario
{
    public static void main(String[] args)
    {
        Scanner stdin = new Scanner (System.in);
        System.out.println("digite un numero");
        int numero= stdin.nextInt(); 
        for(int num=1; num<=numero; num++)
        {
            Entrada.getInstancia();
        }
    }
}
