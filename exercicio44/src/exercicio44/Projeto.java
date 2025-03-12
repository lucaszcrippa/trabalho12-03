
package exercicio44;


 abstract class Projeto {
    private String titulo;
    private String dataInicio;
    private double orcamento;

    // Construtor
    public Projeto(String titulo, String dataInicio, double orcamento) {
        this.titulo = titulo;
        this.dataInicio = dataInicio;
        this.orcamento = orcamento;
    }

    // Métodos get
    public String getTitulo() {
        return titulo;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public double getOrcamento() {
        return orcamento;
    }

    // Método set apenas para orcamento
    public void setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    // Método abstrato para calcular o prazo
    public abstract int calcularPrazo();
}

// Subclasse Filme
class Filme extends Projeto {
    private int duracaoMinutos;

    // Construtor
    public Filme(String titulo, String dataInicio, double orcamento, int duracaoMinutos) {
        super(titulo, dataInicio, orcamento);
        this.duracaoMinutos = duracaoMinutos;
    }

    // Método get e set para duracaoMinutos
    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        this.duracaoMinutos = duracaoMinutos;
    }

    // Implementação do método abstrato calcularPrazo
    @Override
    public int calcularPrazo() {
        return duracaoMinutos / 10; // Prazo calculado com base na duração do filme
    }
}

// Subclasse Musica
class Musica extends Projeto {
    private int numeroNotas;

    // Construtor
    public Musica(String titulo, String dataInicio, double orcamento, int numeroNotas) {
        super(titulo, dataInicio, orcamento);
        this.numeroNotas = numeroNotas;
    }

    // Método get e set para numeroNotas
    public int getNumeroNotas() {
        return numeroNotas;
    }

    public void setNumeroNotas(int numeroNotas) {
        this.numeroNotas = numeroNotas;
    }

    // Implementação do método abstrato calcularPrazo
    @Override
    public int calcularPrazo() {
        return numeroNotas / 50; // Prazo calculado com base no número de notas
    }


}