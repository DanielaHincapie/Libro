package libro;

public class LibroAcademico extends Libro{
    
    private int numeroDeSecciones;
    private String fuente;
    private boolean bibliografia;

    public LibroAcademico(int secciones, String fuente, boolean bibliografia, int numeroDePaginas, Boolean traduccion, String genero) {
        super(numeroDePaginas, traduccion, genero);
        this.numeroDeSecciones = secciones;
        this.fuente = fuente;
        this.bibliografia = bibliografia;
        
    }

    public int getSecciones() {
        return numeroDeSecciones;
    }

    public void setSecciones(int secciones) {
        this.numeroDeSecciones = secciones;
    }

    public String getFuente() {
        return fuente;
    }

    public void setFuente(String fuente) {
        this.fuente = fuente;
    }

    public boolean isBibliografia() {
        return bibliografia;
    }

    public void setBibliografia(boolean bibliografia) {
        this.bibliografia = bibliografia;
    }
    
    public void repartir(){
        this.numeroDeSecciones += 1;
    }
    
    public void repartir(int nuevoNumeroDeSecciones){
        if(nuevoNumeroDeSecciones<=this.numeroDeSecciones){
            System.out.println("Hay " + String.valueOf(numeroDeSecciones) + " secciones");
        }else{
            this.numeroDeSecciones = nuevoNumeroDeSecciones;
            System.out.println("Hay" + String.valueOf(nuevoNumeroDeSecciones) + " secciones");            
        }
        
    }

    
}
