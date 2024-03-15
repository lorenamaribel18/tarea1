/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarealorena;

import java.util.Scanner;

/**
 *
 * @author tenpy 
 */
public class TareaLorena {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       double menorSuma = 0, menorCantidad=0;
       double mayorSuma = 0, mayorCantidad=0;
       int[] edades = new int[5];
       for(int i = 0; i < edades.length; i++ ){
           edades[i] = sc.nextInt();
       }
       for(int i = 0; i < 5; i++ ){
           if(edades[i]<18){
               menorSuma += edades[i];
               menorCantidad++;
           }else{
               mayorSuma += edades[i];
               mayorCantidad++;
           }
       }
       double promedioMenor = menorSuma/menorCantidad;
       double promedioMayor = mayorSuma/mayorCantidad;
       System.out.println("\nResultados:");
       System.out.println("Cantidad de mayores de edad: " + mayorCantidad);
       System.out.println("Cantidad de menores de edad: " + menorCantidad);
       System.out.println("Suma de mayores de edad: " + mayorSuma);
       System.out.println("Suma de menores de edad: " + menorSuma);
       System.out.println("Promedio de edades de mayores de edad: " + promedioMayor);
       System.out.println("Promedio de edades de menores de edad: " + promedioMenor);
      
    }
    
}
