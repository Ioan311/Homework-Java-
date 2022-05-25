package Exceptions;

public class ExceptionPreparate extends RuntimeException {
    public ExceptionPreparate(int pret) {
        super(pret + " nu se atinge comanda minima");
    }
}
