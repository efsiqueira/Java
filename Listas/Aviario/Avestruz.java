public class Avestruz extends Aves {
    
    private double altura;
    private double velocidade;

    public Avestruz(
        int id,
        String bico,
        String penas,
        double altura,
        double velocidade
    ) {
        super(id, bico, penas);
        this.altura = altura;
        this.velocidade = velocidade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    @Override
    public String toString() {
        return "\nAVESTRUZ " + this.getId()
            + "\n- Bico -> " + this.getBico()
            + "\n- Penas -> " + this.getPenas()
            + "\n- Altura -> " + this.getAltura()
            + "\n- Velocidade -> " + this.getVelocidade();
    }

}
