public class Triangulo extends Forma {

    // Propriedades da classe filho que não contém na classe super
    private double ladoTres;

    // Construtor
    public Triangulo(
        int x,
        int y,
        int ladoUm,
        int ladoDois,
        int ladoTres
    ) {
        super(x, y, ladoUm, ladoDois); // Chama o construtor da classe super
        this.ladoTres = ladoTres; // Objeto que não consta na classe super
    }

    public void setLadoTres(double ladoTres) {
        this.ladoTres = ladoTres;
    }

    public double getLadoTres() {
        return this.ladoTres;
    }
    
    @Override
    public String toString() {
        return "Triangulo ["
            + "ladoTres=" + this.getLadoTres()
            + ", ladoDois=" + this.getLadoDois()
            + ", ladoUm=" + this.getLadoUm()
            + ", x=" + this.getX()
            + ", y=" + this.getY()
            + "]";
    }
}