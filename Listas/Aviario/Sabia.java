public class Sabia extends Aves {
    
    private String canto;

    public Sabia(
        int id,
        String bico,
        String penas,
        String canto
    ) {
        super(id, bico, penas);
        this.canto = canto;
    }

    public void setCanto(String canto) {
        this.canto = canto;
    }

    public String getCanto() {
        return this.canto;
    }

    @Override
    public String toString() {
        return "\nSABIÁ " + this.getId()
            + "\n- Bico -> " + this.getBico()
            + "\n- Penas -> " + this.getPenas()
            + "\n- Canto -> " + this.getCanto();
    }

}
