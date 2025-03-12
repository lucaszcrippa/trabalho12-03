
package simulacao;



  abstract class Equipamento {
    private String nome;
    private double precoAluguel;

    // Construtor
    public Equipamento(String nome, double precoAluguel) {
        this.nome = nome;
        this.precoAluguel = precoAluguel;
    }

    // Métodos get e set encapsulados
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoAluguel() {
        return precoAluguel;
    }

    public void setPrecoAluguel(double precoAluguel) {
        this.precoAluguel = precoAluguel;
    }

    // Método abstrato para definir durabilidade
    public abstract int definirDurabilidade();
}

// Subclasse Bicicleta
class Bicicleta extends Equipamento {
    private String tipo;

    // Construtor
    public Bicicleta(String nome, double precoAluguel, String tipo) {
        super(nome, precoAluguel);
        this.tipo = tipo;
    }

    // Método get e set para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Implementação do método abstrato
    @Override
    public int definirDurabilidade() {
        return 50; // Durabilidade fixa de 50 horas
    }
}

// Subclasse Bola
class Bola extends Equipamento {
    private String material;

    // Construtor
    public Bola(String nome, double precoAluguel, String material) {
        super(nome, precoAluguel);
        this.material = material;
    }

    // Método get e set para material
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    // Implementação do método abstrato
    @Override
    public int definirDurabilidade() {
        return 20; // Durabilidade fixa de 20 horas
    }
}
