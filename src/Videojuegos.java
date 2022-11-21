public class Videojuegos {
    String titulo, genero;
    int horasEst;
    boolean entregado;

    public Videojuegos(){
        horasEst = 10;
        titulo = "";
        entregado = false;
        genero = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getHorasEst() {
        return horasEst;
    }

    public void setHorasEst(int horasEst) {
        this.horasEst = horasEst;
    }
}
