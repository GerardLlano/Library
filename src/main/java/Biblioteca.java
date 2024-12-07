import java.util.ArrayList;

class Biblioteca {
    private ArrayList<Libro> listaDeLibros;

    public Biblioteca() {
        this.listaDeLibros = new ArrayList<>();
    }

    public void agregarLibro(String titulo, String autor, int cantidadDisponible) {
        listaDeLibros.add(new Libro(titulo, autor, cantidadDisponible));
        System.out.println("Libro agregado: " + titulo);
    }

    public Libro buscarLibro(String titulo) {
        for (Libro libro : listaDeLibros) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        return null;
    }

    public void prestarLibro(Usuario usuario, String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null) {
            usuario.tomarLibro(libro);
        } else {
            System.out.println("El libro '" + titulo + "' no existe en la biblioteca.");
        }
    }

    public void recibirDevolucion(Usuario usuario, String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null) {
            usuario.devolverLibro(libro);
        } else {
            System.out.println("El libro '" + titulo + "' no existe en la biblioteca.");
        }
    }

    public void mostrarLibrosDisponibles() {
        System.out.println("Libros disponibles en la biblioteca:");
        for (Libro libro : listaDeLibros) {
            libro.mostrarInformacion();
        }
    }
}
