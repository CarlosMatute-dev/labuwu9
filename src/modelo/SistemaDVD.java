
package modelo;

import java.util.ArrayList;

public class SistemaDVD {
    private ArrayList<DVD> catalogo;

    public SistemaDVD() {
        catalogo = new ArrayList<>();
        catalogo.add(new DVD("Interstellar", "Nolan", "Sci-Fi", "Blu-ray"));
        catalogo.add(new DVD("The Godfather", "Coppola", "Drama", "DVD"));
        catalogo.add(new DVD("Alien", "Scott", "Terror", "4K"));
        catalogo.add(new DVD("The Hangover", "Phillips", "Comedia", "DVD"));
        catalogo.add(new DVD("Mad Max", "Miller", "Acción", "Blu-ray"));
        
    }
    
    public void agregarDVD(DVD dvd){catalogo.add(dvd);}
    public ArrayList<DVD> getCatalogo(){return catalogo;}
    public ArrayList<DVD> getDisponibles(){
        ArrayList<DVD> disp = new ArrayList<>();
        for (DVD d: catalogo){
            if (d.isDisponible()){
                disp.add(d);
            }
        }
        return disp;
    }
}
