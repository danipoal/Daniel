/*
 * Chiste.java
 * 
Chistes en un array y elegir uno aleatoriamente para mostrar por pantalla	
 * 
 * 
 */
import java.util.Random;

public class Chiste {
	static final int MAX_CHISTES = 200;
	static String[] bancoChistes = new String[MAX_CHISTES];
	static int iUltimoChiste = 0;
	
	public static void chistes(){

		bancoChistes[0] = "¿Qué le dice un techo a otro? Techo de menos.";
        bancoChistes[1] = "A Josefa le preguntan: Señora, ¿qué opina usted " +
                            "sobre las hipotecas? Pues me parecen muy bien, dice" +
                            " ella, los hipopótamos también tiene derecho a salir y pasárselo bien.";
        bancoChistes[2] = "Una mujer le dice a su madre: Mamá, mi marido se fue ayer a comprar " +
                            "arroz y aún no ha vuelto. No sé que hacer. Ay, hija, no te preocupes, " +
                            "le contesta su madre, ponte a hacer espaguetis.";
        bancoChistes[3] = "El profesor le pregunta a Jaimito: Jaimito, ¿qué fórmula química es H2O+CO+CO? " +
                            "¡Fácil, profesor! Es agua de coco.";
        bancoChistes[4] = "Una madre le dice a su hijo: Jaimito, me ha dicho un pajarito que te drogas. " +
                            "La que te drogas eres tú, que hablas con pajaritos.";
        bancoChistes[5] = "Doctor, doctor, mi bebé tiene seis meses y no abre los ojos. El doctor mira al niño " +
                            "y le dice a su padre: Señor, el que tiene que abrir los ojos es usted, este bebé es chino.";
        bancoChistes[6] = "Mi mujer me hizo creyente, le dice un señor a su amigo. ¿Cómo es eso? Le pregunta el amigo. " +
                            "Pues porque yo no creía en el infierno hasta que me casé con ella.";
        bancoChistes[7] = "Van dos y  se cae el de en medio";
		iUltimoChiste = 7;
		
		}
		
	  public static int aleatorio(int min, int maximo) {
   
        Random numAleatorio = new Random();
        return numAleatorio.nextInt(iUltimoChiste-0 +1)- 0;
    }
	public static void main (String[] args) {
		
		chistes();
		int numAleatorio = aleatorio(0,iUltimoChiste);
		
		System.out.println(bancoChistes[numAleatorio]);
	
	}
}

