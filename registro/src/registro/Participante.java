
package registro;

public class Participante {
    // Atributos privados
    private String nomeCompleto;
    private String email;
    private String dataInscricao;

    // Construtor que recebe apenas nomeCompleto e define a data de inscrição como "12/03/2025"
    public Participante(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
        this.dataInscricao = "12/03/2025";
    }

    // Construtor completo que recebe nomeCompleto, email e dataInscricao
    public Participante(String nomeCompleto, String email, String dataInscricao) {
        this.nomeCompleto = nomeCompleto;
        this.setEmail(email); // Usando o setter para validar o email
        this.dataInscricao = dataInscricao;
    }

    // Métodos get
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getDataInscricao() {
        return dataInscricao;
    }

    // Método set para o atributo email com validação de "@" no email
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Erro: O email deve conter '@'.");
        }
    }

    // Método para exibir as informações do participante
    public void exibirInformacoes() {
        System.out.println("Nome Completo: " + nomeCompleto);
        System.out.println("Email: " + email);
        System.out.println("Data de Inscrição: " + dataInscricao);
    }
}
