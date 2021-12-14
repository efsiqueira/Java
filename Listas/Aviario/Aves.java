public class Aves {
    
    private int id;
    private String bico;
    private String penas;

    public Aves(
        int id,
        String bico,
        String penas
    ) {
        this.id = id;
        this.bico = bico;
        this.penas = penas;
    }

    public void setBico(String bico) {
        this.bico = bico;
    }

    public String getBico() {
        return this.bico;
    }

    public void setPenas(String penas) {
        this.penas = penas;
    }

    public String getPenas() {
        return this.penas;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

}
