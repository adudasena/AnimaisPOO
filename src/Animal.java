// Classe Animal (superclasse)
public abstract class Animal {
    // Atributos
    private String nome;
    private int idade;

    // Construtor
    public Animal(String nome, int idade) { // *Construtor*
        this.nome = nome;
        this.idade = idade;
    }

    // Método abstrato (polimorfismo)
    public abstract void fazerBarulho(); // *Polimorfismo*

    // Getters e setters (encapsulamento)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

