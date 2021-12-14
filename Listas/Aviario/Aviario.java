public class Aviario {
    public static void main(String[] args) {
        Avestruz avestruzFemea = new Avestruz(1, "Achatado", "Plumas", 2.1, 70.0);
        Avestruz avestruzMacho = new Avestruz(2, "Achatado", "Plumas", 2.8, 70.0);

        Sabia sabiaColeira = new Sabia(1, "Pequeno", "Penas", "Alto e leve");
        Sabia sabiaFerreiro = new Sabia(2, "Pequeno", "Penas coloridas", "Baixo e leve");

        System.out.println(avestruzFemea);
        System.out.println(avestruzMacho);
        System.out.println(sabiaColeira);
        System.out.println(sabiaFerreiro);

    }
}
