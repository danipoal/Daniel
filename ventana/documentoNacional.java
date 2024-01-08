import java.util.Scanner;



public class documentoNacional {
    public static void main(String[] args) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        
        System.out.printf("Introduce solo tu numero del DNI:");

        
        Scanner sc = new Scanner(System.in);
        int numeroDni = sc.nextInt();

        System.out.printf("Tu letra del DNI es: %c", letras[numeroDni % 23]);

        System.out.printf("\n\nAhora pon el numero de telefono\n\n\n");
    }
}
