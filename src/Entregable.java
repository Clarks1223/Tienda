public class Entregable {
    Videojuegos j = new Videojuegos();
    public void entregar() {
        j.entregado = true;
    }
    public void devolver() {
        j.entregado = false;
    }
    public boolean isEntregado() {
        return j.entregado;
    }
    public void compareTo(Videojuegos a) {

        public static void burbuja(int[] A) {
            int i, j, aux;
            for (i = 0; i < A.length - 1; i++) {
                for (j = 0; j < A.length - i - 1; j++) {
                    if (A[j + 1] < A[j]) {
                        aux = A[j + 1];
                        A[j + 1] = A[j];
                        A[j] = aux;
                    }
                }
            }
        }

    }


}
