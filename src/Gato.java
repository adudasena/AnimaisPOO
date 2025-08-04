// Classe Gato (subclasse)
public class Gato extends Animal {
    // Atributo específico da classe Gato
    private String cor;

    // Construtor
    public Gato(String nome, int idade, String cor) {
        super(nome, idade); // *Herança*
        this.cor = cor;
    }

    // Implementação do método abstrato fazerBarulho()
    public void fazerBarulho() {
        System.out.println("O gato " + getNome() + " está miando!");
    }

    // Getter e setter para o atributo cor
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
