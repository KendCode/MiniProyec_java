import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) 
	{
		Scanner leer = new Scanner (System.in);
		int n, a, t, res;
		
		System.out.print("Inserte la cantidad de elemtos para la serie: ");
		n = leer.nextInt();
		
		System.out.print("Ingrese el digito para asignar A: ");
		a = leer.nextInt();
		System.out.print("Ingrese el digito T: ");
		t = leer.nextInt();
		
		for ( int i = 1; i <= n; i++)
		{
			res = a * ((int)Math.pow(t,(i-1)));
			System.out.print(res +", ");
		}
	}

}
