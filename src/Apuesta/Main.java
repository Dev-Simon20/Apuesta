package Apuesta;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int marc1,marc2,ma1,ma2,numj;
        int numerojug;
        String nombre;
        
  
        
        System.out.print("Ingrese el numero de jornadas");
        numj=entrada.nextInt();
        String ganadores[]=new String[numj];        
        Porra jornada[]=new Porra[numj];
        
        for (int i = 0; i < numj; i++) {
            System.out.println("\tIngrese el resultado de la jornada");
            System.out.print("Ingrese el marcador 1: ");
            marc1=entrada.nextInt();
            System.out.print("Ingrese el marcador 2: ");
            marc2=entrada.nextInt();
            jornada[i]= new Porra(marc1, marc2);
            System.out.println("");
            System.out.print("Ingrese el numero de jugadores en la jornada "+(i+1)+": ");
            numerojug=entrada.nextInt();
            Futbolista jugador[] =new Futbolista[numerojug];
   
            for (int j = 0; j < numerojug; j++) {
                entrada.nextLine();
                System.out.print("Ingrese el nombre del jugador: ");
                nombre=entrada.nextLine();
                System.out.print("Ingrese el marcador 1: ");
                ma1=entrada.nextInt();
                System.out.print("Ingrese el marcador 2: ");
                ma2=entrada.nextInt();
                jugador[j]= new Futbolista(nombre, ma1, ma2);
                System.out.println("");
            }
            
            for (int h = 0; h < numerojug; h++) {
                if (jornada[i].getMarc1()==jugador[h].getMa1()||jornada[i].getMarc2()==jugador[h].getMa2()) {
                   
                    ganadores[i]=jugador[h].getNombre();
                    break;
                }
                else{
                    ganadores[i]="Nadie acerto";
                }
            }
            
            
            
            
        }
        
        for (int j = 0; j < numj; j++) {
                System.out.println(ganadores[j]);
            }
        
    }
    
  
    
    
}
