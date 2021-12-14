public class Principal {
    public static void main(String[] args) {
        //Criando as padarias com os parâmetros passados na classe Padaria
        Padaria padariaUm = new Padaria (1, "Padaria Alfa", "01/01/1995", 1, "89320-452", "Rua José Manoel Voluz", "772", "Sítio Cercado", "Curitiba");
        Padaria padariaDois = new Padaria (2, "Padaria Anita", "10/10/2017", 1, "89478-791", "Rua Anita", "222", "Anita Garibaldi", "Joinville");
        Padaria padariaTres = new Padaria (3, "Padaria Helena", "02/07/2004", 1, "89521-785", "Rua Monsenhor Gercino", "1000", "João Costa", "Joinville");

        //Criando os chefs com os parâmetros passados na classe Chef
        Chef chefUm = new Chef (1, "Érick Jacquin", "84562139805", "09/12/1964");
        Chef chefDois = new Chef (2, "Henrique Fogaça", "14536789564", "11/04/1974");
        Chef chefTres = new Chef (3, "Paola Carosella", "25893641781", "30/10/1972");

        //Criando as receitas já com os chefs adicionados nos parâmetros da classe Receita
        Receita receitaUm = new Receita(1, "Sonho", "Junte os ingredientes, acrescente farinha, adicione ovos e misture, divida a massa em bolinhas, leve a geladeira, asse por 20 mintuos", 6, chefUm);
        Receita receitaDois = new Receita(2, "Bolo de aipim", "Bata os ingredientes no liquidificador, despeje numa tigela e adicione fermento, misture até a massa ficar homogenea, asse por 40 minutos", 4, chefUm);
        Receita receitaTres = new Receita(3, "Pão de queijo", "Bata os ingredientes no liquidificador, acrescente queijo a gosto, bata até ficar homogeneo, despeje numa forma e leve para assar, asse por 40 minutos", 5, chefUm);
        Receita receitaQuatro = new Receita(4, "Salgadinho", "Misture os ingredientes numa tigela, mexa bem, leve na geladeira por 30 minutos, estique a massa e faça bolinhas, frite em fogo médio", 5, chefDois);
        Receita receitaCinco = new Receita(5, "Bolo de milho", "Bata o milho por 1 minuto, acrescente margarina e leite, bata até a massa ficar homogenea, adicione fubá e fermento, leve para assar por 40 minutos, desenforme", 6, chefDois);
        Receita receitaSeis = new Receita(6, "Bolinho de carne", "Tempere a carne, forme bolinhas, frite por 20 minutos", 3, chefDois);
        Receita receitaSete = new Receita(7, "Pão de forma", "Dissolva o fermento no açucar e acrescente sal, acrescente farinha, deixe a massa descansar por 1h, coloque na forma, leve para assar por 30 minutos", 5, chefTres);
        Receita receitaOito = new Receita(8, "Pastel frito", "Adicione os ingredientes numa bacia, amasse bem até que a massa fique consistente, deixe descansar por 15 minutos, modele os pastéis, frite", 5, chefTres);
        Receita receitaNove = new Receita(9, "Pastel assado", "Misture os ingredientes, mexa até a massa ficar homogenea, rechear os pastéis, pincelar os pastéis com gema, levar ao forno para assar", 5, chefTres);

        //Adicionando as receitas as padarias com o método "adicionarReceita" vindo da classe Padaria
        padariaUm.adicionarReceita(receitaNove);
        padariaUm.adicionarReceita(receitaOito);
        padariaUm.adicionarReceita(receitaSete);
        padariaUm.adicionarReceita(receitaSeis);
        padariaUm.adicionarReceita(receitaCinco);
        padariaDois.adicionarReceita(receitaCinco);
        padariaDois.adicionarReceita(receitaQuatro);
        padariaDois.adicionarReceita(receitaTres);
        padariaDois.adicionarReceita(receitaDois);
        padariaDois.adicionarReceita(receitaUm);
        padariaTres.adicionarReceita(receitaDois);
        padariaTres.adicionarReceita(receitaTres);
        padariaTres.adicionarReceita(receitaQuatro);
        padariaTres.adicionarReceita(receitaCinco);
        padariaTres.adicionarReceita(receitaSeis);

        //Printa o nome dos chefes e suas receitas
        //Usa um foreach para percorrer a classe Receita e puxar as receitas de cada chef
        System.out.println("\nNome dos Chefs e suas receitas:\n");
        System.out.println("Receitas do Chef " + chefUm.nome);
        for (Receita receita : chefUm.receitas) {
            System.out.println(receita.nome);
        }

        System.out.println("\nReceitas do Chef " + chefDois.nome);
        for (Receita receita : chefDois.receitas) {
            System.out.println(receita.nome);
        }

        System.out.println("\nReceitas do Chef " + chefTres.nome);
        for (Receita receita : chefTres.receitas) {
            System.out.println(receita.nome);
        }

        System.out.println("\n==================================");

        //Printa o nome das padarias e suas receitas
        //Usa um foreach para percorrer a classe Receita e puxar as receitas de cada padaria
        System.out.println("\nNome das Padarias e suas receitas:\n");
        System.out.println("Receitas da " + padariaUm.nome);
        System.out.println("Endereço:");
        System.out.println("\nCEP: " + padariaUm.endereco.cep + ", Rua: " + padariaUm.endereco.rua + ", Número: "
        + padariaUm.endereco.numero + ", Bairro: " + padariaUm.endereco.bairro + ", Cidade: " + padariaUm.endereco.cidade);
        for (Receita receita : padariaUm.receitas) {
            System.out.println(receita.nome);  
        }

        System.out.println("\nReceitas da " + padariaDois.nome);
        System.out.println("\nCEP: " + padariaDois.endereco.cep + ", Rua: " + padariaDois.endereco.rua + ", Número: "
        + padariaDois.endereco.numero + ", Bairro: " + padariaDois.endereco.bairro + ", Cidade: " + padariaDois.endereco.cidade);
        for (Receita receita : padariaDois.receitas) {
            System.out.println(receita.nome);  
        }

        System.out.println("\nReceitas da " + padariaTres.nome);
        System.out.println("\nCEP: " + padariaTres.endereco.cep + ", Rua: " + padariaTres.endereco.rua + ", Número: "
        + padariaTres.endereco.numero + ", Bairro: " + padariaTres.endereco.bairro + ", Cidade: " + padariaTres.endereco.cidade);
        for (Receita receita : padariaTres.receitas) {
            System.out.println(receita.nome); 
        }

    }
}
