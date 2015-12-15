import java.util.Scanner;
class Calculadora
{
	// SUMA: Le pasamos los dos operandos y visualiza el resultado
	private static void SUMA( int S0, int S1 ) 
	{
		int suma = S0 + S1;

		System.out.println( "La suma es: " + suma );
	}
	// Le pasamos dos parametros y devuelve el resultado
	private static int RESTA( int S0, int S1 ) 
	{
		return S0 - S1;
	}
	// Pedimos los datos en la función y retorna el resultado
	private static int MULTI() 
	{	
		Scanner sc = new Scanner( System.in );

		System.out.println( "Primer factor" );
		int S0 = sc.nextInt();
		System.out.println( "Segundo factor" );
		int S1 = sc.nextInt();

		int producto = S0 * S1;
		return producto;
	}
	// Pedimos los datos en la funcion y visualiza el resultado
	private static void DIVI() 
	{	
		Scanner sc = new Scanner( System.in );

		System.out.println( "Dividendo: " );
		int S0 = sc.nextInt();
		System.out.println( "Divisor: " );
		int S1 = sc.nextInt();

		float cociente = S0 / S1;
			
		System.out.print( "El cociente es: " + cociente );
	}
	// Pedimos los datos en la funcion y retorna el resultado
	private static int CAMBIO_S() 
	{	
		Scanner sc = new Scanner( System.in );

		System.out.println( "Introducir numero entero para cambiar de signo: " );
		int num = sc.nextInt();

		return -1 * num;
	}
	// Creamos un menu con las distintas opciones mas una para salir
	// Elegir una opcion distinta genera ERROR.
	public static void main( String[] args )
	{
		int selec, n1, n2;
		Scanner sc = new Scanner( System.in );

		do {
			// MENU
			System.out.println( " Seleccionar una opción:  " );
			System.out.println( " \t[1] Sumar. " );
			System.out.println( " \t[2] Restar. " );
			System.out.println( " \t[3] Multiplicar. " );
			System.out.println( " \t[4] Dividir. " );
			System.out.println( " \t[5] Cambiar signo. " );
			System.out.println( " \t[6] Salir. " );
			////////////////////////////////////
			
			selec = sc.nextInt();

			switch( selec )
			{
				case 1:
					// Pido los datos para enviarselos a la funcion
					System.out.println( "Primer sumando:" );
					n1 = sc.nextInt();
					System.out.println( "Segundo sumando:" );
					n2 = sc.nextInt();
					// Llamo a la funcion pasandole los parametros
					SUMA( n1, n2 );	
					break;
				case 2:
					// Pido los datos para enviarselos a la funcion
					System.out.println( "Minuendo:" );
					n1 = sc.nextInt();
					System.out.println( "Sustraendo:" );
					n2 = sc.nextInt();
					// Llamo a la funcion pasandole los parametros
					// y guardo el resultado en diferencia
					int diferencia = RESTA( n1, n2 );
					System.out.println( "La diferencia es: " + diferencia );
					break;
				case 3:
					System.out.println( "El producto es: " + MULTI() );
					break;
				case 4:
					// llamada a la funcion para dividir
					DIVI();
					break;
				case 5:
					System.out.println( CAMBIO_S() );
					break;
				case 6:
					break;
				default:
					System.out.println( " -------------------------------- " );
					System.out.println( " -      Opcion incorrecta!      - " );
					System.out.println( " -------------------------------- " );
			}
		} while( selec != 6 );
	}
}
