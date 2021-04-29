package ejemplosgit;

public class Caja {

    double alto, ancho, largo;

    Caja(double a, double b, double c) {
        alto = a;
        ancho = b;
        largo = c;
    }

    Caja() {
        alto = -1;
        ancho = -1;
        largo = -1;
    }

    Caja(double longitud) {
        alto = ancho = largo = longitud;
    }
}
