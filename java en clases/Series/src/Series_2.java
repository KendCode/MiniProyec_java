import java.util.Scanner;
public class Series_2 {

	public static void main(String[] args)
	{
		Scanner leer = new Scanner (System.in);
		int n, k, sw=0;
		
		System.out.print("Ingrese un digito: ");
		n = leer.nextInt();
		
		System.out.print("Ingrese el siguente digito: ");
		k = leer.nextInt(); 
		int a = k;
		
		for(int i = 1; i<=n; i++)
		{
			System.out.print(a+", ");
			if(sw == 0)
			{
				a--;
				if(a == 0)
				{
					a = 2; 
					sw = 1;
				}
			}
			else
			{
				a++;
				if(a == k+1)
				{
					a -= 2;
					sw = 0;
				}
			}
		}

	}

}
