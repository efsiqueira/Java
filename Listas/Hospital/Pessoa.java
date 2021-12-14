import java.util.Objects;

public class Pessoa {
    private String nome;
    private String cpf;
    private String dtNasc;

    protected Pessoa(
        String nome,
        String cpf,
        String dtNasc
    ) {
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getNome() {
        return this.nome;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getCpf() {
        return this.cpf;
    }

    protected void setDtnasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    protected String getDtnasc() {
        return this.dtNasc;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pessoa)) {
            return false;
        }
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(cpf, pessoa.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, dtNasc);
    }

    @Override
    public String toString() {
        return "{" +
        " nome='" + getNome() + "'" +
        ", cpf='" + getCpf() + "'" +
        ", data de nascimento='" + getDtnasc() + "'" +
        "}";
    }

    protected String carteira() {
        return "Nome: " + this.getNome()
            + "\nCPF: " + this.getCpf()
            + "\nData de nasc.: " + this.getDtnasc();
    }

}
