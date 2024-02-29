package Paquete1;

import java.util.Random;

public class RamaPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Numero;
		System.out.println("Ola Rama");
		System.out.println("Prueba con la ramita");
		System.out.println("NUMEROS ALEATORIOS");
		Random numeroAleatorio = new Random();
		
		  System.out.println( "Insertando los siguientes valores: " ); 
			// inserta 10 enteros aleatorios de 0 a 99 en arbol
		  for ( int i = 1; i <= 10; i++ )
	    {
	       Numero = numeroAleatorio.nextInt( 100 );
	       System.out.print( Numero + " " );
	    }
		
	}

}
