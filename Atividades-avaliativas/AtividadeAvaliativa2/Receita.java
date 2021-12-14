import java.util.ArrayList;

//Cria a classe Receita e suas propriedades
public class Receita {
    int idReceita;
    String nome;
    String etapas;
    int nrEtapas;
    ArrayList<Padaria> padarias = new ArrayList<>(); //ArrayList para armazenar todas as padarias
    Chef chef; //Propriedade da classe Chef

    public Receita (
        int idReceita,
        String nome,
        String etapas,
        int nrEtapas,
        Chef chef
    ) {
        this.idReceita = idReceita;
        this.nome = nome;
        this.etapas = etapas;
        this.nrEtapas = nrEtapas;
        this.chef = chef;
        chef.adicionarReceita(this); //Método da classe Chef
    }

    //Método adicionarPadaria com os parâmetros da padaria
    public void adicionarPadaria(Padaria padaria) {
        this.padarias.add(padaria); //Adiciona lista de padarias na padaria
    }
}
