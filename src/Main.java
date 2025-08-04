// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criação de objetos
        Cachorro cachorro = new Cachorro("Boby", 3, "Poodle");
        Gato gato = new Gato("Mia", 2, "Preto");

        // Chamada dos métodos
        cachorro.fazerBarulho();t
        gato.fazerBarulho();

        // Acessando atributos e métodos
        System.out.println("Nome do cachorro: " + cachorro.getNome());
        System.out.println("Raça do cachorro: " + cachorro.getRaca());
        System.out.println("Nome do gato: " + gato.getNome());
        System.out.println("Cor do gato: " + gato.getCor());
    }
}

