
package javaapplication19;

import java.util.Scanner;


public class ComparadorCalif {

 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos alumnos tienes");
        int n = sc.nextInt();
        
        double[] calificaciones = new double[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("ingresa la calificacion de cada alumno");
            calificaciones[i] = sc.nextDouble();
            
            
        }
        
        double suma= 0;
        double mayor = calificaciones[0];
        double menor = calificaciones[0];
        
        for (int i = 0; i < n; i++) {
            suma+=calificaciones[i];
            if(calificaciones[i]>mayor){
                mayor=calificaciones[i];
        }
            if(calificaciones[i]<menor){
                menor=calificaciones[i];
            }
            
        }
        double promedio = suma/n;
        System.out.println("\nresultados");
        
        System.out.println("calificaicones ingresadas");
        for (int i = 0; i < n; i++) {
            System.out.println("alumno"+(i+1)+calificaciones[i]);
            
        }
        System.out.println("\npromedio general" +promedio);
        System.out.println("\ncalificacion mas alta"+mayor);
        System.out.println("\ncalificacion mas baja"+menor);

    }
    
}
