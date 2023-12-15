import java.util.Scanner;
public class PrestamoPepe{

	public static void Ejercicio11(double dinero){

		double dineroInteres = dinero * 0.05;

		double tiempo = Math.ceil((dinero + dineroInteres) / 100);

		double ultimoMes = (dinero + dineroInteres) % 100;

		System.out.printf("Si obtenemos un prestamo de %.2f habrá que devolver %f\n De manera que se realizara en %f meses, siendo %f el importe del ultimo mes", dinero, dinero + dineroInteres, tiempo, ultimoMes);

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        //Scanner sc = new Scanner(System.in);
		
        //double dinero = sc.nextInt();

		CalculoMensualidad11(1000);
	}

}
