package dominio;

import java.util.Scanner;


public class testPuntoPlano {

    
    public static void main(String[] args) {
        Punto T1;
        Punto T2;
        Scanner entrada=new Scanner(System.in);
        int x=0;
        int y=0;
        int opcion=0;
        int incremento=0;
        int cantidadM=0,contadorM=0;
        T1=new Punto(x,y);
        T2=new Punto(x,y);
        System.out.println("\n La Posicion Actual (X;Y) es : ("+T1.getX()+", "+T1.getY()+")");
        
        System.out.println("\n\t. Menú.\n");
        System.out.print("Por Favor Ingrese la cantidad de Movimientos: ");
        cantidadM=entrada.nextInt();
        System.out.print("Por favor Ingrese la cantidad de espacios a moverse: ");
        incremento=entrada.nextInt();
       
                do {
                //Genero movimiento arriba, abajo, izquierda,derecha aleatorios entre 1 y 4
                double movimiento=Math.random()*3+1;
                opcion=(int)movimiento;
                switch(opcion){
                    case 1: T1.moverArriba(incremento); break;
                    case 2: T1.moverAbajo(incremento); break;
                    case 3: T1.moverDerecha(incremento); break;
                    case 4: T1.moverIzquierda(incremento); break;
                    case 5: break;
                    default: System.out.println("Error"); break;
                }

                System.out.println("\n Posicion (X;Y): ("+T1.getX()+", "+T1.getY()+")");
                contadorM++;
                    } while (contadorM<cantidadM); 
    }
    
}

