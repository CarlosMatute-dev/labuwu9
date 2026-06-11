package modelo;
public class DVD {
    private String titulo;
    private String director;
    private String genero;
    private String formato;
    private boolean disponible;

    public DVD(String titulo, String director, String genero, String formato, boolean disponible) {
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.formato = formato;
        this.disponible = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean d) {
        this.disponible = d;
    }
    
    @Override
    public String toString(){
        return titulo + " (" + genero + ") - " + formato;
    }
    
    
}