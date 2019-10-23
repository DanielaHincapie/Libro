package libro;

public class Libro {

    private int numeroDePaginas;
    private final Boolean traduccion;
    private String genero;
    
    public Libro(int numeroDePaginas,Boolean traduccion, String genero){
        this.numeroDePaginas = numeroDePaginas;
        this.traduccion = traduccion;
        this.genero = genero;
    }
    
    public int getNumeroDePaginas(){
        return numeroDePaginas;
    }
    
    public Boolean gettraduccion(){
        return traduccion;
    }
    
    public void traducir(Boolean traduccion){
        traduccion = true;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero = genero;
    }
    
     public void aumentarTamanoDeFuente(){
        this.numeroDePaginas += 10;
    }
    
    public void aumentarTamanoDeFuente(int nuevoNumeroDePaginas){
        if(nuevoNumeroDePaginas<=this.numeroDePaginas){
            System.out.println(String.valueOf(numeroDePaginas));
        }else{
            this.numeroDePaginas = nuevoNumeroDePaginas;
            System.out.println(String.valueOf(nuevoNumeroDePaginas) + " paginas");            
        }
        
    }

    
}

