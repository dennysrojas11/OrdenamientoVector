package ordenarvector;

import java.util.Scanner;

/* 
  @author wolfie 
 */
public class OrdenarVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //declaración de variables
        float temp;
        int n,i,j;
        float[] T=new float[50];
        //se pide el tamaño del vector
        System.out.println("Ingrese el número de posiciones del vector");
        n=in.nextInt();
        //ingreso de los valores del vector
        for(i=1;i<=n;i++){
            System.out.println("Ingrese el valor del vector en la posición "+i);
            T[i]=in.nextFloat();
        }
        //impresión del vector ingresado
        System.out.println("\nVector ingresado");
        for (i=1;i<=n;i++){
            System.out.print(T[i]+"  ");
        } 
        //ordenamiento del vector
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(T[j]>T[j+1]){
                    temp=T[j];
                    T[j]=T[j+1];
                    T[j+1]=temp;
                }
            }
        }
        //impresión del vector ordenado
        System.out.println("\nVector ordenado");
        for (i=1;i<=n;i++){
            System.out.print(T[i]+"  ");
        }    
    }        
}