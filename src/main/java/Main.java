public class Main {

    public static void main(String[] args) {


        // Crear biblioteca, usuario y libros

        Biblioteca biblioteca = new Biblioteca();
        Usuario gerardo = new Usuario("Gerardo");

        // Agregar libros
        biblioteca.agregarLibro("El Hijo de los Mares", "Fran Llano", 3);

        // Mostrar libros disponibles
        biblioteca.mostrarLibrosDisponibles();

        // Usuario toma prestado
        biblioteca.prestarLibro(gerardo, "El Hijo de los Mares");

        // Mostrar información del usuario
        gerardo.mostrarInformacion();

        // usuairo devuelve el libro
        biblioteca.recibirDevolucion(gerardo, "El Hijo de los Mares");

        // Mostrar libros disponibles nuevamente
        biblioteca.mostrarLibrosDisponibles();
    }
}