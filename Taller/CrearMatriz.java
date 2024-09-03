import java.util.Scanner;

public class CrearMatriz
{
	static int Matriz;
	static int Tamano;

	public CrearMatriz(int Tamano)
	{
		this.Tamano=Tamano;
	}

	public void LlenarMatriz()
	{
		//Diagonal Principal;

		//Triangulo Superior;

		//Triangulo Inferior;

	}

	public void ImprimirMatriz()
	{
		for (int i=0; i<Tamano; i++ )
		{
			for (int j=0; j<Tamano; j++)
			{

			}
		}
	}

	public static void main (String[] args)
	{
		Scanner TamanoUsuario =  new Scanner(System.in);
		Tamano = TamanoUsuario.nextInt();

		System.out.print(Tamano);
	}

}
