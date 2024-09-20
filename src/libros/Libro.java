package libros;

public class Libro {

    //variables
    String titulo;
    String autor;
    int pagina;
    int yearspublicacion;


    //constructor
    public Libro(String titulo,String autor, int pagina, int yearspublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.pagina = pagina;
        this.yearspublicacion = yearspublicacion;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getYearspublicacion() {
        return yearspublicacion;
    }

    public void setYearspublicacion(int yearspublicacion) {
        this.yearspublicacion = yearspublicacion;
    }

    public void mostraDatosLibros(){
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Numero de paginas: " + pagina);
        System.out.println("Año publicación :" + yearspublicacion);


    }

}
