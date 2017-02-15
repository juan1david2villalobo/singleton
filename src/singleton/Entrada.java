// juan david villalobo   20142020224
package Singleton;
public class Entrada
{
    private static Entrada instancia;
    private Entrada() {
    }
     public static Entrada getInstancia()
    {
         if (instancia == null) {
             instancia = new Entrada();
            System.out.println("la entrada esta creada\n");
        }
        else {
            System.out.println("no hay ninguna entrada");
        }
         return instancia;
    }
}