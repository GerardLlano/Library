class Libro {

    private String titulo;
    private String autor;
    private int cantidadDisponible;

    public Libro(String titulo, String autor, int cantidadDisponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void prestar() {
        if (cantidadDisponible > 0) {
            cantidadDisponible--;
        } else {
            System.out.println("No hay copias disponibles de '" + titulo + "'.");
        }
    }

    public void devolver() {
        cantidadDisponible++;
    }

    public void mostrarInformacion() {
        System.out.println("Título: " + titulo + ", Autor: " + autor + ", Cantidad Disponible: " + cantidadDisponible);
    }
}