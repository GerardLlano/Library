import java.util.ArrayList;

class Usuario {
    private String nombre;
    private ArrayList<Libro> listaDeLibrosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.listaDeLibrosPrestados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void tomarLibro(Libro libro) {
        if (libro.getCantidadDisponible() > 0) {
            libro.prestar();
            listaDeLibrosPrestados.add(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido prestado a " + nombre + ".");
        } else {
            System.out.println("El libro '" + libro.getTitulo() + "' no está disponible.");
        }
    }

    public void devolverLibro(Libro libro) {
        if (listaDeLibrosPrestados.contains(libro)) {
            libro.devolver();
            listaDeLibrosPrestados.remove(libro);
            System.out.println("El libro '" + libro.getTitulo() + "' ha sido devuelto por " + nombre + ".");
        } else {
            System.out.println(nombre + " no tiene el libro '" + libro.getTitulo() + "'.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Usuario: " + nombre);
        System.out.println("Libros prestados:");
        for (Libro libro : listaDeLibrosPrestados) {
            System.out.println(" - " + libro.getTitulo());
        }
    }
}