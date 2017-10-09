
package boletin.pkg2.pkg1;
import java.util.Scanner;
public class Boletin21 {

    public static void main(String[] args) {
        
       Scanner sc= new Scanner(System.in);
       float ventas,km,dias,soldob,soldol,soldof,IRPF=18,RSS=36;
       System.out.println("teclea soldo fixo:");
       soldof=sc.nextFloat();
       System.out.println("teclea ventas:");
       ventas=sc.nextFloat();
       System.out.println("teclea kilometraje;");
       km=sc.nextFloat();
       System.out.println("teclea dietas:");
       dias=sc.nextFloat();
       soldob=soldof+5*ventas/100+2*km+30*dias;
       System.out.println("soldo bruto= "+soldob+ " euros");
       soldol=soldob-IRPF*soldob/100-RSS;
       System.out.println("soldo liquido= "+ soldol);
       
       
       
       
       
       
      
    
    }
}
