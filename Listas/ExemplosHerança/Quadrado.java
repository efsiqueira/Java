public class Quadrado extends Forma {
    
    // Propriedades não definidas, pois já existem na classe super
    public Quadrado(
        int x,
        int y,
        int ladoUm,
        int ladoDois
    ) {
        super(x, y, ladoUm, ladoDois);
    }

    @Override
    public String toString() {
        return "Triangulo ["
            + ", ladoDois=" + this.getLadoDois()
            + ", ladoUm=" + this.getLadoUm()
            + ", x=" + this.getX()
            + ", y=" + this.getY()
            + "]";
    }

}