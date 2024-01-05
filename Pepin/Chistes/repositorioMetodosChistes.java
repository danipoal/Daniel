import java.util.Arrays;
import java.util.Random;
import java.util.regex.*;

public class repositorioMetodosChistes{
    static final int MAX_CHISTES = 50;
    static int contadorChiste = 1;
    static String[] chistes = new String[MAX_CHISTES];
    

    public static void iniciarChistes(){
        chistes[0] = "Que chiste!";
        
        
    }
  
    public static void introducirChiste(String chiste){
        chistes[contadorChiste] = chiste + "\n";                                                //Cambio realizado aqui
        contadorChiste++;
        System.out.println("Chiste introducido! - " + chistes[contadorChiste-1] /*+ "\n" */);   //Cambio realizado aqui
    }

    public static void eliminarChiste(int nChiste){
        System.out.printf("Chiste eliminado - " + chistes[nChiste] + "\n");
        for(; nChiste < chistes.length - 1; nChiste++){
            chistes[nChiste] = chistes[nChiste+1];
        }
               
    }
    public static void colorear(String color, int nChiste){     //No se puede repintar si ya esta pintado, habria que eliminar dichos caracteres i substituirlos por otros
        
        String expresionColor = "\\u001B\\[([0-9;]+)m.*?\\u001B\\[0m";
        Pattern patronColor = Pattern.compile(expresionColor);
        Matcher matcherColor = patronColor.matcher(chistes[nChiste]);

        if (matcherColor.find()) {                              //Si hay coincidencia en alguna parte del chiste con la expresion, true
            String coincidencia = matcherColor.group(1);  //Poniendo un 1, coge la expresion exacta que coincide

            System.out.println(coincidencia);                   //Esto captura el numero de color del codigo ansi
        }

        
        
        if(color.equals("rojo")){                       //Se podria repintar con un pattern y matcher.
            chistes[nChiste] = "\u001B[31m" + chistes[nChiste] + "\u001B[0m";    // Tiene que acabar con el color negro para que se resetee
            System.out.printf(chistes[nChiste]);
        }else if(color.equals("azul")){
            chistes[nChiste] = "\u001B[34m" + chistes[nChiste] + "\u001B[0m";
            System.out.printf(chistes[nChiste]);
        }else if(color.equals("amarillo")){
            chistes[nChiste] = "\u001B[33m" + chistes[nChiste] + "\u001B[0m";
            System.out.printf(chistes[nChiste]);
        }else{
            System.err.println("Eso no es un color, o es un color no disponible");
        }
    }
    public static String getChistes(){
        
        return Arrays.toString(chistes).replace(", null", "");      //El replace hace que todos los espacios null se eliminen por nada
    }

    public static String getRandomChiste(){
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(0, contadorChiste);      //Random desde el 0 hasta el n de chistes introducidos
        
        System.out.print(randomNumber + ":");
        return chistes[randomNumber];

    }
}
