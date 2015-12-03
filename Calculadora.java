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
	private static int RESTA() 
	{
		return 0;
	}
	// Pedimos los datos en la función y retorna el resultado
	private static int MULTI() 
	{	
		return 0;
	}
	// Pedimos los datos en la funcion y visualiza el resultado
	private static void DIVI() 
	{	
		System.out.print( 0 );
	}
	// Pedimos los datos en la funcion y retorna el resultado
	private static int CAMBIO_S() 
	{	
		return 0;
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
					System.out.println( "Primer nando:" );
					n1 = sc.nextInt();
					System.out.println( "Segundo nando:" );
					n2 = sc.nextInt();
					// Llamo a la funcion pasandole los parametros
					SUMA( n1, n2 );	
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
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
