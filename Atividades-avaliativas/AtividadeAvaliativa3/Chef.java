import java.util.ArrayList;
import java.util.Objects;

// Criação da classe com herança da Superclasse Pessoa
public class Chef extends Pessoa{

    // Propriedades do objeto (criado em private para ser acessado apenas pela classe)
    private String especialidade;
    private ArrayList<Receita> receitas = new ArrayList<>();

    // Construtor
    public Chef(
        int id,
        String nome,
        String cpf,
        String dataNasc,
        String especialidade
    ){
        super(id, nome, cpf, dataNasc); // Informando que os dados descritos vem da superclasse Pessoa
        this.especialidade = especialidade;
    }

    // Criação dos setters e getters
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return this.especialidade;
    }

    public void setReceitas(Receita receita) {
        this.receitas.add(receita);
        receita.setChef(this);
    }

    public ArrayList<Receita> getReceitas() {
        return this.receitas;
    }

    // Método que verifica se o objeto existe (é igual)
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Chef)) {
            return false;
        }
        Chef chef = (Chef) o;
        return Objects.equals(this.getId(), chef.getId());
    }

    // Cria um hashcode 'assinatura' para o objeto
    @Override
    public int hashCode() {
        return Objects.hash(especialidade, receitas);
    }

    // Altera o método padrão da classe para retornar os dados informados
    @Override
    public String toString() {
        String ret = "\n========== Chef " + this.getId() + " ==========" +
            "\n Nome: " + this.getNome() +
            "\n cpf: " + this.getCpf() +
            "\n Data de nascimento: " + this.getDataNasc() +
            "\n Especialidade: " + this.getEspecialidade() +
            "\n\n========== RECEITAS ==========";
            
            // Foreach passando por toda a classe Receita para printar as receitas de cada Chef
            for (Receita receita : this.receitas) {
                ret += "\n   " + receita.toString();
            }

        return ret;
    }

}