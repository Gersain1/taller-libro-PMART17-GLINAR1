package libros;

public class Principal {
    public static void main(String[] args) {
        Libro libroUno = new Libro("El principito", "Antoine de Saint-Exupéry", 96, 1943);
        Libro libroDos = new Libro("Cien años de soledad", "Gabriel García Márquez", 417, 1967);
        System.out.println("Los datos del libro uno son: ");
        libroUno.mostraDatosLibros();
        System.out.println("Los datos del libro dos son: \n");
        libroDos.mostraDatosLibros();
        libroUno.setPagina(100);
        System.out.println("Los datos modificados del libro uno son: \n");
        libroUno.mostraDatosLibros();
    }


}
