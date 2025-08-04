// Classe Cachorro (subclasse)
public class Cachorro extends Animal {
    // Atributo específico da classe Cachorro
    private String raca;

    // Construtor
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade); // *Herança*
        this.raca = raca;
    }

    // Implementação do método abstrato fazerBarulho()
    public void fazerBarulho() {
        System.out.println("O cachorro " + getNome() + " está latindo!");
    }

    // Getter e setter para o atributo raca
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
