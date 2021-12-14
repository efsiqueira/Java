public class Forma {
    // Classe super
    // Cria as propriedades em private
    private int x;
    private int y;
    private double ladoUm;
    private double ladoDois;

    // Construtor
    public Forma (
        int x,
        int y,
        int ladoUm,
        int ladoDois
    ) {
        this.x = x;
        this.y = y;
        this.ladoUm = ladoUm;
        this.ladoDois = ladoDois;
    }

    // Define as propriedades
    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return this.x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return this.y;
    }

    public void setLadoUm(double ladoUm) {
        this.ladoUm = ladoUm;
    }

    public double getLadoUm() {
        return this.ladoUm;
    }

    public void setLadoDois(double ladoDois) {
        this.ladoDois = ladoDois;
    }

    public double getLadoDois() {
        return this.ladoDois;
    }

    public void setCoords(int x, int y) {
        this.setX(x);
        this.setY(y);
    }

}