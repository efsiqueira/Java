import java.util.ArrayList;

//Cria a classe Chef e suas propriedades
public class Chef {
    int idChef;
    String nome;
    String cpf;
    String dataNasc;
    ArrayList<Receita> receitas = new ArrayList<>(); //ArrayList para armazenar todas as receitas

    //Construtor do chef
    public Chef (
        int idChef,
        String nome,
        String cpf,
        String dataNasc
    ) {
        this.idChef = idChef;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    //Método para adicionar receitas com parâmetro da classe Receita
    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
    }
}