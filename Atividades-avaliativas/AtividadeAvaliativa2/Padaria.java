import java.util.ArrayList;

//Cria a classe padaria e suas propriedades
public class Padaria {
    int idPadaria;
    String nome;
    String dataAbertura;
    Endereco endereco; //Relaciona a classe Endereco
    ArrayList<Receita> receitas = new ArrayList<>(); //ArrayList para armazenar todas as receitas

    //Criação do construtor Padaria com seus parâmetros
    public Padaria (
        int idPadaria,
        String nome,
        String dataAbertura,
        int idEndereco,
        String cep,
        String rua,
        String numero,
        String bairro,
        String cidade
    ) {
        this.idPadaria = idPadaria;
        this.nome = nome;
        this.dataAbertura = dataAbertura;
        this.endereco = new Endereco (
            idEndereco,
            cep,
            rua,
            numero,
            bairro,
            cidade
        );
    }

    //Método adicionarReceita recebendo a classe Receita e adicionando as receitas do ArrayList em "receita"
    public void adicionarReceita(Receita receita) {
        this.receitas.add(receita);
        receita.adicionarPadaria(this); //Adicionando as receitas nas respectivas padarias
    }
}