package libro;

public class LibroDeDrama extends Libro{
  
    private int capitulos;
    private String personajes;
    private boolean ilustraciones;

    public LibroDeDrama(int capitulos, String personajes, boolean ilustraciones, int numeroDePaginas, Boolean traduccion, String genero) {
        super(numeroDePaginas, traduccion, genero);
        this.capitulos = capitulos;
        this.personajes = personajes;
        this.ilustraciones = ilustraciones;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }

    public String getPersonajes() {
        return personajes;
    }

    public void setPersonajes(String personajes) {
        this.personajes = personajes;
    }

    public boolean isIlustraciones() {
        return ilustraciones;
    }

    public void setIlustraciones(boolean ilustraciones) {
        this.ilustraciones = ilustraciones;
    }

     public void ilustrar(boolean ilustraciones){
        if(ilustraciones = true){
            System.out.println("Libro ilustrado");
        }else{
            ilustraciones = false;
            System.out.println("Libro solo texto");            
        }
    }
}
