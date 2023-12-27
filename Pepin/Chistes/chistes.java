import java.util.Scanner;

public class chistes extends repositorioMetodosChistes{

    public static void main(String[] args){

        //Inicializamos los datos necesarios iniciales
        Scanner sc = new Scanner(System.in);
        iniciarChistes();
        //Inicializamos el menú
        int numeroMenu;
        do{
        numeroMenu = -1;
        System.out.printf("\n-------MENU PRINCIPAL-------\n");
        System.out.println("1: Introduce un chiste");
        System.out.println("2: Elimina un chiste");
        System.out.println("3: Colorea un chiste");
        System.out.println("4: Ver todos los chistes");
        System.out.println("5: Ver un chiste aleatorio");
        System.out.println("6: Cuenta el chiste que elijas");
        System.out.printf("\n0: EXIT\n");

        
        if(sc.hasNextInt()){      //Comprobamos que el usuario introduce un entero por pantalla
            numeroMenu = sc.nextInt();
            if(numeroMenu > 6) System.out.printf("No hay tantas opciones en el menu\n");
            sc.nextLine();  //Para vaciar el buffer por si queda un \n
        }else{                  //Lo que hacemos si introduce caracteres
            System.out.printf("\u001B[31mError, tienes que introducir un número del menú. Vuelve a probar\n\u001B[0m");
            sc.nextLine();      //Vaciamos el buffer para que no se lance el error mil veces
        }        
        switch (numeroMenu) {
            case 1:
                System.out.printf("Introduce tu mejor chiste!\n");
                introducirChiste(sc.nextLine());
                numeroMenu = -1;
                break;
            case 2:
                System.out.printf("Que numero de chiste quieres eliminar: ");
                eliminarChiste(sc.nextInt());
                numeroMenu = -1;
                break;
            case 3:
                System.out.println("De que color quieres pintarlo ? [rojo, azul o amarillo]");
                String color = sc.nextLine();
                System.out.println("Que chiste quieres colorear? Indica el numero");
                int nColor = sc.nextInt();      //Si se introduce algo que no es int, de momento da error.
                colorear(color, nColor);
                numeroMenu = -1;

            case 4:
                System.out.printf(getChistes());
                numeroMenu = -1;
            
            case 5:
                System.out.printf(getRandomChiste());
                numeroMenu = -1;
            default:
                break;
        }

            
        }while(numeroMenu == -1 || numeroMenu > 6);

    }
}