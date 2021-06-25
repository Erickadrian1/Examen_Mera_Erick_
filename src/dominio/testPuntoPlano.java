package dominio;

import java.util.Scanner;


public class testPuntoPlano {

    
    public static void main(String[] args) {
        Punto P1;
        Punto P2;
        Scanner entrada=new Scanner(System.in);
        int x=0;
        int y=0;
        int opcion=0;
        int aumento=0;
        int cantidadM=0,contadorM=0;
        P1=new Punto(x,y);
        P2=new Punto(x,y);
        System.out.println("\n La Posicion Actual (X;Y) es : ("+P1.getX()+", "+P1.getY()+")");//Posicion inicial (0,0)
        
        System.out.println("\n\t. Menú.\n");
        System.out.print("Por Favor Ingrese la cantidad de Movimientos que desea realizar : ");//Ingreso de la cantidad de movimientos
        cantidadM=entrada.nextInt();
        System.out.print("Por favor Ingrese la cantidad de espacios a moverse: ");//Ingreso de los movimientos
        aumento=entrada.nextInt();
       
                do {
                //Genero movimiento arriba, abajo, izquierda,derecha aleatorios entre 1 y 4
                double movimiento=Math.random()*3+1;
                opcion=(int)movimiento;
                switch(opcion){
                    case 1: P1.moverArriba(aumento); break;
                    case 2: P1.moverAbajo(aumento); break;
                    case 3: P1.moverDerecha(aumento); break;
                    case 4: P1.moverIzquierda(aumento); break;
                    case 5: break;
                    default: System.out.println("Error"); break;
                }

                System.out.println("\n Posicion (X;Y): ("+P1.getX()+", "+P1.getY()+")"); //Posicion despues de realizar los movimientos
                contadorM++; 
                    } while (contadorM<cantidadM); 
    }
    
}

