public class Hospital {
    public static void main(String[] args) {
        Paciente pacienteUm = new Paciente("Flávia", "123.456.789-12", "25/04/2003", "0000001");
        Paciente pacienteDois = new Paciente("Débora", "987.654.321-02", "31/08/1995", "0000002");
        Paciente pacienteTres = new Paciente("Fábio", "159.753.654-85", "19/03/1999", "0000003");

        Medico medicoUm = new Medico("Letícia", "321.654.987-45", "09/04/1993", "34900", "PR");
        Medico medicoDois = new Medico("Eduardo", "123.859.467-12", "15/09/1994", "35845", "SC");
        Medico medicoTres = new Medico("Julia", "456.123.972-95", "22/07/1998", "39080", "RS");

        Consulta consultaUm = new Consulta("21/03/2021", "Sinusite aguda", medicoUm, pacienteUm);
        Consulta consultaDois = new Consulta("16/07/2021", "Diarreia", medicoUm, pacienteUm);
        Consulta consultaTres = new Consulta("17/07/2021", "Dor de cabeça", medicoUm, pacienteUm);
        Consulta consultaQuatro = new Consulta("21/07/2021", "Dor no dedinho", medicoUm, pacienteUm);
        Consulta consultaCinco = new Consulta("10/08/2021", "Dor de barriga", medicoDois, pacienteDois);
        Consulta consultaSeis = new Consulta("15/08/2021", "Língua queimada", medicoDois, pacienteDois);
        Consulta consultaSete = new Consulta("27/08/2021", "Torsão no pé", medicoDois, pacienteDois);
        Consulta consultaOito = new Consulta("01/09/2021", "Pulso quebrado", medicoTres, pacienteTres);
        Consulta consultaNove = new Consulta("07/09/2021", "'Conjuntivite'", medicoTres, pacienteTres);
        Consulta consultaDez = new Consulta("20/09/2021", "Cólica", medicoTres, pacienteTres);

        System.out.println(pacienteUm.carteira());
        System.out.println();
        System.out.println(pacienteDois.carteira());
        System.out.println();
        System.out.println(pacienteTres.carteira());

        System.out.println();
        System.out.println(medicoUm.carteira());
        System.out.println();
        System.out.println(medicoDois.carteira());
        System.out.println();
        System.out.println(medicoTres.carteira());

    }
}
