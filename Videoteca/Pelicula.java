//package Videoteca;

public class Pelicula {
    private String titulo;
    private int anho;
    private String pais;
    private Director director;
    private Actor[] actores = new Actor[8];

    public Pelicula(String titulo, int anho, String pais){
        this.titulo = titulo;
        this.anho = anho;
        this.pais = pais;
    }

    public Pelicula(String titulo, int anho, String pais, Director director, Actor[] actores){
        this.titulo = titulo;
        this.anho = anho;
        this.pais = pais;
        this.director = director;
        this.actores = actores;
    }

    public void imprimir(){
        System.out.printf(this.titulo, this.anho);
    }

    public void imprimirDetalle(){
        System.out.printf(this.titulo + ": Fue publicada en el año: " + this.anho);
        System.out.println("Dirigida por: " + this.director);
        
    }

    public static void main(String[] args) {
        Videoteca v = new Videoteca();

        v.menuOpciones();
    }
}
