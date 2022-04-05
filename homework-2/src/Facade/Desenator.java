package Facade;

/*
pe scurt, creez o interfata(Figura) si clase concrete care implementeaza intefata. Clasa Desenator deseneaza propriu zis figura,
aceasta clasa foloseste clasele concrete pentru a emite apelurile
 */
public class Desenator {
    Figura linie;
    Figura cerc;
    Figura patrat;

    public Desenator() {
        linie = new Linie();
        cerc = new Cerc();
        patrat = new Patrat();
    }

    public void deseneazaLinie() {
        linie.deseneaza();
    }

    public void deseneazaCerc() {
        cerc.deseneaza();
    }

    public void deseneazaPatrat() {
        patrat.deseneaza();
    }
}
